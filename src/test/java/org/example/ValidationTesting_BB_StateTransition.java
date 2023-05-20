package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

//Validation module
class ValidationTesting_BB_StateTransition {

    //Positive test for student data
    @Test
    void isStudentDataTrue() {
        StudentData s1 = new StudentData("John Doe", "12345678",new ArrayList<Double>(Arrays.asList(8.0, 9.0, 18.0, 50.0)));
        String message = Validation.IsStudentDataTrue(s1);
        assertEquals("valid", message, "Failure @ : BlackBox--isStudentDataTrue--Invalid student data");
    }
    //Negative test for student name
    @Test
    void isStudentDataFalse_Name() {
        StudentData s1 = new StudentData("12John Doe", "12345678",new ArrayList<Double>(Arrays.asList(8.0, 9.0, 18.0, 50.0)));
        String message = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid student name", message, "Failure @ : BlackBox--isStudentDataFalse_Name--Invalid student name");
    }

    //Negative test for student id
    @Test
    void isStudentDataFalse_ID() {
        StudentData s1 = new StudentData("John Doe", "@1234567",new ArrayList<Double>(Arrays.asList(8.0, 9.0, 18.0, 50.0)));
        String message = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid student id", message, "Failure @ : BlackBox--isStudentDataTrue--Invalid student data");
    }

    //Negative test for student mark
    @Test
    void isStudentDataFalse_Marks() {
        StudentData s1 = new StudentData("John Doe", "12345678",new ArrayList<Double>(Arrays.asList(-12.0, 9.0, 12.0, 50.0)));
        String message = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid activity mark", message, "Failure @ : BlackBox--isStudentDataFalse_Marks--Invalid student mark");
    }

    //Positive scenario for subject data
    @Test
    void isSubjectDataTrue() {
        String[] subject = {"English", "ASU335s", "100"};
        assertDoesNotThrow(() -> Validation.IsSubjectDataTrue(subject),"Failed @ : isSubjectDataTrue");
    }

    //Negative scenario for subject name
    @Test
    void isSubjectDataFalse_Name() {
        String[] subject = {"English1", "ASU335s", "100"};
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : isSubjectDataFalse_Name");
    }

    //Negative scenario for subject code
    @Test
    void isSubjectDataFalse_Code() {
        String[] subject = {"English1", "ASU33$s", "100"};
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : isSubjectDataFalse_Code");
    }


}