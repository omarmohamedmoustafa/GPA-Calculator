package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GPACalculatorTest {
    @Test
    void calcGPA_PositiveScenario() {
        StudentData s1 = new StudentData();
        Double [] marks = {5.0 , 5.0 , 5.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.CPlus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPAPostiveScenario");

    }
    @Test
    void calcGPA_Boundaries_APlus() {
        StudentData s1 = new StudentData();
        Double [] marks = {7.0 , 10.0 , 20.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.APlus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_Boundaries_APlus");

    }

    @Test
    void calcGPA_Boundaries_A() {
        StudentData s1 = new StudentData();
        Double [] marks = {3.0 , 10.0 , 20.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.A, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_Boundaries_A");

    }

    @Test
    void calcGPA_Boundaries_AMinus() {
        StudentData s1 = new StudentData();
        Double [] marks = {1.0 , 8.0 , 20.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.AMinus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_Boundaries_AMinus");

    }

    @Test
    void calcGPA_Boundaries_BPlus() {
        StudentData s1 = new StudentData();
        Double [] marks = {1.0 , 3.0 , 20.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.BPlus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_Boundaries_BPlus");

    }

    @Test
    void calcGPA_Boundaries_B() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 20.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.B, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_Boundaries_B");

    }

    @Test
    void calcGPA_Boundaries_BMinus() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 16.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.BMinus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_Boundaries_BMinus");

    }

    @Test
    void calcGPA_Boundaries_CPlus() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 16.0 ,57.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.CPlus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_Boundaries_CPlus");

    }

    @Test
    void calcGPA_Boundaries_C() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 16.0 ,54.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.C, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_Boundaries_C");

    }

    @Test
    void calcGPA_Boundaries_CMinus() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 16.0 ,51.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.CMinus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_Boundaries_CMinus");

    }
    @Test
    void calcGPA_Boundaries_DPlus() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 13.0 ,51.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.DPlus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_Boundaries_DPlus");

    }

    @Test
    void calcGPA_Boundaries_D() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 10.0 ,50.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.D, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_Boundaries_D");

    }

    @Test
    void calcGPA_Boundaries_F() {
        StudentData s1 = new StudentData();
        Double [] marks = {3.0 , 3.0 , 3.0 ,50.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.F, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_Boundaries_F");

    }

    @Test
    void calcGPA_Boundaries_lessThanZero() throws Exception{
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 0.0 ,-5.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.UnavailableSmallerThanZ,GPACalculator.calcGPA(s1.getGrade()),"calcGPA_Boundaries_lessThanZero");

    }

    @Test
    void calcGPA_Boundaries_BiggerThan100() throws Exception{
        StudentData s1 = new StudentData();
        Double [] marks = {10.0 , 10.0 , 20.0 ,70.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.UnavailableBiggerThanH,GPACalculator.calcGPA(s1.getGrade()),"calcGPA_Boundaries_lessThanZero");

    }



}