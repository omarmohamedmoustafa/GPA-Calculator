package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class getFileParser_IntegrationTest {

    @Test
    void fileRead() {
        //Integration test with parser and readFile
        String path = "test.txt";
        ArrayList<String> data = getFile.FileRead(path);

        ArrayList<StudentData> studentData = Parser.parse(data);
        String[] subjectData = Parser.getSubjectInfo(data);
        StudentData s1 = new StudentData("John Doe", "12345678",new ArrayList<Double>(Arrays.asList(8.0, 9.0, 18.0, 50.0)));
        StudentData s2 = new StudentData("Jane Smith", "23456789",new ArrayList<Double>(Arrays.asList(10.0, 8.0, 17.0, 52.0)));

        String[] expectedSubject = {"English","ENG101","100"};
        ArrayList<StudentData> expectedStudentData = new ArrayList<>();
        expectedStudentData.add(s1);
        expectedStudentData.add(s2);

        assertArrayEquals(expectedSubject, subjectData, "Failure @ : IntegrationTest--Invalid subject data");
        for (int i = 0; i < expectedStudentData.size(); i++) {
            assertEquals(expectedStudentData.get(i).getName(), studentData.get(i).getName(), "Failure @ : parser_positiveScenario--Invalid student name");
            assertEquals(expectedStudentData.get(i).getId(), studentData.get(i).getId(), "Failure @ : parser_positiveScenario--Invalid student id");
            assertArrayEquals(expectedStudentData.get(i).getMarks().toArray(), studentData.get(i).getMarks().toArray(), "Failure @ : parser_positiveScenario--Invalid student marks");
        }

    }
}