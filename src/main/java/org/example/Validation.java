package org.example;

public class Validation {
    public  static String IsStudentDataTrue(StudentData student) {
        if (!(student.getName().matches("^[A-Za-z][A-Za-z ]*$"))) {
            return ("Invalid student name");
        }
        if (!(student.getId().matches("^[0-9]{7}[A-Za-z0-9]$"))){
            return("Invalid student id");
        }
        if (!(student.getMarks().get(0) >= 0 && student.getMarks().get(0)  <= 10)) {
            return("Invalid activity mark");
        }
        if (!(student.getMarks().get(1)  >= 0 && student.getMarks().get(1)  <= 10)) {
            return("Invalid oral/practical mark");
        }
        if (!(student.getMarks().get(2)  >= 0 && student.getMarks().get(2)  <= 20)) {
            return("Invalid midterm exam mark");
        }
        if (!(student.getMarks().get(3)  >= 0 && student.getMarks().get(3)  <= 60)) {
            return("Invalid final exam mark");
        }
        return ("valid");
    }
    public  static void IsStubjectDataTrue(String[] subject) {
        if (!(subject[0].matches("^[A-Za-z][A-Za-z ]*$")))  {
            throw new IllegalArgumentException("Invalid subject name");
        }
        if (!(subject[1].matches("^[A-Za-z]{3}[0-9]{3}s?$"))) {
            throw new IllegalArgumentException("Invalid subject code");
        }
    }
}