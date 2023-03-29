package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GPACalculatorTest {
    @Test
    void calcGPA() {
        StudentData s1 = new StudentData();
        ArrayList<Double> arr = new ArrayList<Double>();
        arr.add(5.0);
        arr.add(5.0);
        arr.add(5.0);
        arr.add(60.0);
        s1.setMarks(arr);

        assertEquals(GPA.C, GPACalculator.calcGPA(s1.getGrade()));

        // All boundaries test
        // grade >=0  and <=100
    }

}