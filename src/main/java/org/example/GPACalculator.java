package org.example;

public class GPACalculator {

    public static GPA calcGPA(Double grade) {

        //double grade = studentData.getGrade();

        if(grade > 100 || grade < 0) {
            throw new IllegalArgumentException();
        }
        if(grade >= 97 ) {
            return GPA.APlus;
        }

        if(grade >= 93 ) {
            return GPA.A;
        }
        if(grade >= 89 ) {
            return GPA.AMinus;
        }
        if(grade >= 84 ) {
            return GPA.BPlus;
        }
        if(grade >= 80 ) {
            return GPA.B;
        }

        if(grade >= 76 ) {
            return GPA.BMinus;
        }

        if(grade >= 73 ) {
            return GPA.CPlus;
        }

        if(grade >= 70 ) {
            return GPA.C;
        }
        if(grade >= 67 ) {
            return GPA.CMinus;
        }

        if(grade >= 64 ) {
            return GPA.DPlus;
        }

        if(grade >= 60) {
            return GPA.D;
        }

        return GPA.F;

    }
}
