package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {
//  case of null student is not covered
    @Test
    void isStudentDataNotNull() {
        ArrayList<Double> Marks = new ArrayList<>();
        Marks.add(10.0); Marks.add(10.0); Marks.add(10.0); Marks.add(10.0);
        StudentData student = new StudentData("Ahmed","22222222",Marks);
        String expectedMessage = "Invalid";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
           Validation.IsStudentDataTrue(student);
        });
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void studentNameValidation() {
        // FirstNotSpace
        // only alphabetic
        // not null

    }
    @Test
    void studentIdValidation() {
        // exact 8 alphanumeric
        // first 7 digits are numbers
        // last digit (7) can be alphabetic or numeric
        // no special character anywhere
        // not null

    }
    @Test
    void studentMarksValidation() {
        // All 4 fields should be Integers
        // [0:10] , [0,10] , [0,20] , [0,60]
        // all 4 fields not null
        // sum of all 0 <= fieldsSum <=100

    }
        @Test
    void isStubjectDataTrue() {
            // Subject Name
                //  FirstNotSpace
                //  only alphabetic
                //  not null
            //Subject Code
                // 6-7 alphanumeric characters (3 alphapet + 3 numeric + ('s'))
                // last must  be s if size ==7
                // else 3 alphabet + 3 number
                // not null
    }

}
