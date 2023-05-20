package org.example;

public class Validation { 
    public  static void IsStudentDataTrue(StudentData student) {
        if (!(student.getName().matches("^[A-Za-z][A-Za-z ]*$"))) {
            System.out.println( student.getName() + "is Invalid student name");
            return;
        }
        if (!(student.getId().matches("^[0-9]{7}[A-Za-z0-9]$"))){
            System.out.println( student.getId() + "is Invalid student ID");
            return;
        }
        if (!(student.getMarks().get(0) >= 0 && student.getMarks().get(0)  <= 10)) {
            System.out.println( student.getName() + "has Invalid activity mark"); 
            return;
        }
        if (!(student.getMarks().get(1)  >= 0 && student.getMarks().get(1)  <= 10)) {
            System.out.println( student.getName() + "has Invalid oral/practical mark");
            return;
        }
        if (!(student.getMarks().get(2)  >= 0 && student.getMarks().get(2)  <= 20)) {
            System.out.println( student.getName() + "has Invalid midterm exam mark");
            return;
        }
        if (!(student.getMarks().get(3)  >= 0 && student.getMarks().get(3)  <= 60)) {
            System.out.println( student.getName() + "has Invalid final exam mark");  
            return;
        }
        
        student.setGrade_flag(true);
    }
    public  static void IsSubjectDataTrue(String[] subject) {
        if (!(subject[0].matches("^[A-Za-z][A-Za-z ]*$")))  {
            throw new IllegalArgumentException("Invalid subject name");
        }
        if (!(subject[1].matches("^[A-Za-z]{3}[0-9]{3}s?$"))) {
            throw new IllegalArgumentException("Invalid subject code");
        }
    }
}