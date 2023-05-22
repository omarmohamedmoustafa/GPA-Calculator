package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

    //10
class Validation_WB_StatementCoverage {
    //Move to all if statements and last return "Valid"(8/14)==>57.14%
    //Statements: 1, 3, 5, 7, 9, 11, 13, 14
    @Test
    void isStudentDataTrue() {
        StudentData s1 = new StudentData("John Doe", "12345678",new ArrayList<Double>(Arrays.asList(8.0, 9.0, 18.0, 50.0)));
        String message = Validation.IsStudentDataTrue(s1);
        assertEquals("valid", message, "Failure @ : BlackBox--isStudentDataTrue--Invalid student data");
    }

    //Statements: 1, 2
    @Test
    void isStudentDataFalse_Name() {
        StudentData s1 = new StudentData("12John Doe", "12345678",new ArrayList<Double>(Arrays.asList(8.0, 9.0, 18.0, 50.0)));
        String message = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid student name", message, "Failure @ : BlackBox--isStudentDataFalse_Name--Invalid student name");
    }

    //Statements: 1, 3, 4
    @Test
    void isStudentDataFalse_ID() {
        StudentData s1 = new StudentData("John Doe", "@1234567",new ArrayList<Double>(Arrays.asList(8.0, 9.0, 18.0, 50.0)));
        String message = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid student id", message, "Failure @ : BlackBox--isStudentDataTrue--Invalid student data");
    }

    //Statements: 1, 3, 5, 6
    @Test
    void isStudentDataFalse_ActivityMarks() {
        StudentData s1 = new StudentData("John Doe", "12345678",new ArrayList<Double>(Arrays.asList(-12.0, 9.0, 12.0, 50.0)));
        String message = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid activity mark", message, "Failure @ : BlackBox--isStudentDataFalse_ActivityMarks--Invalid student mark");
    }

    //Statements: 1, 3, 5, 7, 8
    @Test
    void isStudentDataFalse_OralMarks() {
        StudentData s1 = new StudentData("John Doe", "12345678",new ArrayList<Double>(Arrays.asList(9.0, -9.0, 12.0, 50.0)));
        String message = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid oral/practical mark", message, "Failure @ : BlackBox--isStudentDataFalse_OralMarks--Invalid student mark");
    }

    //Statements: 1, 3, 5, 7, 9, 10
    @Test
    void isStudentDataFalse_MidtermMarks() {
        StudentData s1 = new StudentData("John Doe", "12345678",new ArrayList<Double>(Arrays.asList(9.0, 9.0, -12.0, 50.0)));
        String message = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid midterm exam mark", message, "Failure @ : BlackBox--isStudentDataFalse_MidtermMarks--Invalid student mark");
    }

    //Statements: 1, 3, 5, 7, 9, 11,12
    @Test
    void isStudentDataFalse_FinalExamMark() {
        StudentData s1 = new StudentData("John Doe", "12345678",new ArrayList<Double>(Arrays.asList(9.0, 9.0, 12.0, -50.0)));
        String message = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid final exam mark", message, "Failure @ : BlackBox--isStudentDataFalse_FinalExamMark--Invalid student mark");
    }

    //SubjectData
    //Statements: 1, 2
    @Test
    void isSubjectDataFalse_Name() {
        String[] subject = {"English1", "ASU335s", "100"};
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : isSubjectDataFalse_Name");
    }

    //Statements: 1, 3, 4
    @Test
    void isSubjectDataFalse_Code() {
        String[] subject = {"English1", "ASU33$s", "100"};
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : isSubjectDataFalse_Code");
    }
}