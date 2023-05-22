package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GPACalculator_WB_BranchCoverage {

    //14
    @Test
    void calcGPA_WB_BranchCoverage_lessThanZero() throws Exception{
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 0.0 ,-5.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);
        assertEquals(GPA.UnavailableSmallerThanZ,GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_lessThanZero");

    }

    @Test
    void calcGPA_WB_BranchCoverage_BiggerThan100() throws Exception{
        StudentData s1 = new StudentData();
        Double [] marks = {10.0 , 10.0 , 20.0 ,70.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.UnavailableBiggerThanH,GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_lessThanZero");
    }
    @Test
    void calcGPA_WB_BranchCoverage_APlus() {
        StudentData s1 = new StudentData();
        Double [] marks = {7.0 , 10.0 , 20.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.APlus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_APlus");

    }

    @Test
    void calcGPA_WB_BranchCoverage_A() {
        StudentData s1 = new StudentData();
        Double [] marks = {3.0 , 10.0 , 20.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.A, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_A");

    }

    @Test
    void calcGPA_WB_BranchCoverage_AMinus() {
        StudentData s1 = new StudentData();
        Double [] marks = {1.0 , 8.0 , 20.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.AMinus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_AMinus");

    }

    @Test
    void calcGPA_WB_BranchCoverage_BPlus() {
        StudentData s1 = new StudentData();
        Double [] marks = {1.0 , 3.0 , 20.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.BPlus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_BPlus");

    }

    @Test
    void calcGPA_WB_BranchCoverage_B() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 20.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.B, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_B");

    }

    @Test
    void calcGPA_WB_BranchCoverage_BMinus() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 16.0 ,60.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.BMinus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_BMinus");

    }

    @Test
    void calcGPA_WB_BranchCoverage_CPlus() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 16.0 ,57.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.CPlus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_CPlus");

    }

    @Test
    void calcGPA_WB_BranchCoverage_C() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 16.0 ,54.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.C, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_C");

    }

    @Test
    void calcGPA_WB_BranchCoverage_CMinus() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 16.0 ,51.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.CMinus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_CMinus");

    }
    @Test
    void calcGPA_WB_BranchCoverage_DPlus() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 13.0 ,51.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.DPlus, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_DPlus");

    }

    @Test
    void calcGPA_WB_BranchCoverage_D() {
        StudentData s1 = new StudentData();
        Double [] marks = {0.0 , 0.0 , 10.0 ,50.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.D, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_D");

    }

    @Test
    void calcGPA_WB_BranchCoverage_F() {
        StudentData s1 = new StudentData();
        Double [] marks = {3.0 , 3.0 , 3.0 ,50.0};
        ArrayList<Double> arr = new ArrayList<Double>(Arrays.stream(marks).toList());
        s1.setMarks(arr);

        assertEquals(GPA.F, GPACalculator.calcGPA(s1.getGrade()),"Failed @ : calcGPA_WB_BranchCoverage_F");

    }
}