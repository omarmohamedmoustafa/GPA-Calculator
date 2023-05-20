package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest_WB_DataFlow {
    ArrayList<String> inputData = new ArrayList<String>(Arrays.asList("English,ENG101,100","John Doe,12345678,8,9,18,50"));
    //studentParser
    @Test
    void parser_dataFlow() {
        ArrayList <StudentData> res = Parser.parse(inputData);
        StudentData expected = new StudentData("John Doe", "12345678",new ArrayList<Double>(Arrays.asList(8.0, 9.0, 18.0, 50.0)));
        StudentData actual = res.get(0);
        assertAll(
                () -> assertEquals(expected.getName(), actual.getName(), "Failure @ : parser_dataFlow--Invalid student name"),
                () -> assertEquals(expected.getId(), actual.getId(), "Failure @ : parser_dataFlow--Invalid student id"),
                () -> assertArrayEquals(expected.getMarks().toArray(), actual.getMarks().toArray(), "Failure @ : parser_dataFlow--Invalid student marks")
        );
    }

    @Test
     //subjectParser
    void parser_Subject_dataFlow() {
        String[] expectedSubject = {"English","ENG101", "100"};
        String[] res = Parser.getSubjectInfo(inputData);
        assertArrayEquals(expectedSubject, res, "Failure @ : parser_Subject_dataFlow--Invalid parse");
    }
}