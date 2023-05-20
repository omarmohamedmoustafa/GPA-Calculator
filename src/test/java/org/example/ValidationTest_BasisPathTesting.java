package org.example;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest_BasisPathTesting {

    @Test
    public void testValidStudentData() {
        StudentData student = new StudentData();
        student.setName("12as");
        student.setId("1234567A");
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(8.0);
        grades.add(9.0);
        grades.add(18.0);
        grades.add(55.0);

        student.setMarks(grades);

        String result = Validation.IsStudentDataTrue(student);
        assertEquals("Invalid student name", result);
    }
    @Test
    public void testValidStudentId() {
        StudentData student = new StudentData();
        student.setName("Moh gad");
        student.setId("123");
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(8.0);
        grades.add(9.0);
        grades.add(18.0);
        grades.add(55.0);

        student.setMarks(grades);

        String result = Validation.IsStudentDataTrue(student);
        assertEquals("Invalid student id", result);
    }
    @Test
    public void testValidStudentActivityMark() {
        StudentData student = new StudentData();
        student.setName("Ali");
        student.setId("1901573A");
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(15.0);
        grades.add(9.0);
        grades.add(18.0);
        grades.add(55.0);

        student.setMarks(grades);

        String result = Validation.IsStudentDataTrue(student);
        assertEquals("Invalid activity mark", result);
    }
    @Test
    public void testValidStudentPracticalMark() {
        StudentData student = new StudentData();
        student.setName("Muhamed");
        student.setId("1900819B");
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(9.0);
        grades.add(14.0);
        grades.add(18.0);
        grades.add(55.0);

        student.setMarks(grades);

        String result = Validation.IsStudentDataTrue(student);
        assertEquals("Invalid oral/practical mark", result);
    }
    @Test
    public void testValidStudentMidtermMark() {
        StudentData student = new StudentData();
        student.setName("Ahmed");
        student.setId("1900731C");
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(8.0);
        grades.add(9.0);
        grades.add(50.0);
        grades.add(55.0);

        student.setMarks(grades);

        String result = Validation.IsStudentDataTrue(student);
        assertEquals("Invalid midterm exam mark", result);
    }
    @Test
    public void testValidStudentFinalMark() {
        StudentData student = new StudentData();
        student.setName("Omar Mh");
        student.setId("1900953D");
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(7.0);
        grades.add(4.0);
        grades.add(13.0);
        grades.add(86.0);

        student.setMarks(grades);

        String result = Validation.IsStudentDataTrue(student);
        assertEquals("Invalid final exam mark", result);
    }
    @Test
    public void testValidStudentdata() {
        StudentData student = new StudentData();
        student.setName("John Doe");
        student.setId("1852367E");
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(9.0);
        grades.add(10.0);
        grades.add(18.0);
        grades.add(54.0);

        student.setMarks(grades);

        String result = Validation.IsStudentDataTrue(student);
        assertEquals("valid", result);
    }
    @Test
    public void testValidSubjectData() {
        String[] subject = {"Arabic", "ABC101"};
        try {
            Validation.IsSubjectDataTrue(subject);
        } catch (IllegalArgumentException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
    @Test
    public void testInValidSubjectName() {
        String[] subject = {"1A2S4","ABC101"};
        try {
            Validation.IsSubjectDataTrue(subject);
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid subject name" , e.getMessage());
        }
    }
    @Test
    public void testInvalidSubjectCode() {
        String[] subject = {"Arabic","101ABC"};
        try {
            Validation.IsSubjectDataTrue(subject);
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid subject code", e.getMessage());
        }
    }






}