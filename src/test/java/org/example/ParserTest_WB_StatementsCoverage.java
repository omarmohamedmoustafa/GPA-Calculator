package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest_WB_StatementsCoverage {
    ArrayList<String> inputData;
    ArrayList<Double> marks;
    StudentData expected;
    @BeforeEach
    void setUp(){
        inputData = new ArrayList<String>(Arrays.asList("English,ENG101,100","John Doe,12345678,8,9,18,50"));
        marks = new ArrayList<Double>(Arrays.asList(8.0, 9.0, 18.0, 50.0));
    }

    //getSubjectInfo function
    //Statments: 1, 2, 3
    @Test
    void getSubjectInfo() {
        String[] expectedSubject = {"English","ENG101", "100"};
        String[] res = Parser.getSubjectInfo(inputData);
        assertArrayEquals(expectedSubject, res, "Failure @ : getSubjectInfo--Invalid parse");
    }

    //parseStudentData
    //Statements: 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14
    @Test
    void parser_positiveScenario() {
        inputData.set(1,"John Doe,12345678,8,9,18,50");
        ArrayList <StudentData> res = Parser.parse(inputData);
        expected = new StudentData("John Doe", "12345678",marks);
        StudentData actual = res.get(0);
        assertAll(
                () -> assertEquals(expected.getName(), actual.getName(), "Failure @ : parser_positiveScenario--Invalid student name"),
                () -> assertEquals(expected.getId(), actual.getId(), "Failure @ : parser_positiveScenario--Invalid student id"),
                () -> assertArrayEquals(expected.getMarks().toArray(), actual.getMarks().toArray(), "Failure @ : parser_positiveScenario--Invalid student marks")
        );
    }
}