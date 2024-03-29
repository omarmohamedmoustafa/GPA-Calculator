package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest_UnitTesting {

    StudentData expected;
    ArrayList<String> inputData;
    ArrayList<Double> marks;
    @BeforeEach
    void setUp(){
        inputData = new ArrayList<String>(Arrays.asList("English,ENG101,100","John Doe,12345678,8,9,18,50"));
        marks = new ArrayList<Double>(Arrays.asList(8.0, 9.0, 18.0, 50.0));
    }

    // parser of students
    // only alphabetic ,FirstNotSpace
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

    @Test
    // separate fields only if ',' between them
    void parser_dotSeparator() {
        inputData.set(1,"John Doe.12345678,12345678,8,9,18,50");
        expected = new StudentData("John Doe.12345678", "12345678",marks);
        ArrayList <StudentData> res = Parser.parse(inputData);
        StudentData actual = res.get(0);
        assertAll(
                () -> assertEquals(expected.getName(), actual.getName(), "Failure @ : parser_dotSeparator--Invalid student name"),
                () -> assertEquals(expected.getId(), actual.getId(), "Failure @ : parser_dotSeparator--Invalid student id"),
                () -> assertArrayEquals(expected.getMarks().toArray(), actual.getMarks().toArray(), "Failure @ : parser_dotSeparator--Invalid student marks")
        );
    }

    @Test
    // separate fields only if ',' between them
    void parser_dollarSeparator() {
        inputData.set(1,"John$Doe,12345678,8,9,18,50");
        expected = new StudentData("John$Doe", "12345678",marks);
        ArrayList <StudentData> res = Parser.parse(inputData);
        StudentData actual = res.get(0);
        assertAll(
                () -> assertEquals(expected.getName(), actual.getName(), "Failure @ : parser_dotSeparator--Invalid student name"),
                () -> assertEquals(expected.getId(), actual.getId(), "Failure @ : parser_dotSeparator--Invalid student id"),
                () -> assertArrayEquals(expected.getMarks().toArray(), actual.getMarks().toArray(), "Failure @ : parser_dotSeparator--Invalid student marks")
        );
    }

    // subjectSeparation

    @Test
        //need to commment line 10 in Parser.java
    void parser_Subject_positiveScenario() {
        String[] expectedSubject = {"English","ENG101", "100"};
        String[] res = Parser.getSubjectInfo(inputData);
        assertArrayEquals(expectedSubject, res, "Failure @ : parser_Subject_positiveScenario--Invalid parse");
    }
    @Test
    //need to commment line 10 in Parser.java
    void parser_Subject_dotSeparator() {
        inputData.set(0,"English.ENG101,100");
        String[] expectedSubject = {"English.ENG101", "100"};
        String[] res = Parser.getSubjectInfo(inputData);
        assertArrayEquals(expectedSubject, res, "Failure @ : parser_Subject_dotSeparator--Invalid parse");
    }

    @Test
    //need to commment line 10 in Parser.java
    void parser_Subject_dollarSeparator() {
        inputData.set(0,"$EnglishENG101,100");
        String[] expectedSubject = {"$EnglishENG101", "100"};
        String[] res = Parser.getSubjectInfo(inputData);
        assertArrayEquals(expectedSubject, res, "Failure @ : parser_Subject_dollarSeparator--Invalid parse");
    }

}