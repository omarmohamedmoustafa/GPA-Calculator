package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Parser {
    public static String[] getSubjectInfo(ArrayList<String> Arr){
        String[] subjectInfo =  Arr.get(0).split(",");
       Validation.IsSubjectDataTrue(subjectInfo);
        return  subjectInfo;
    }

    //StudentParser
    public static ArrayList <StudentData> parse(ArrayList<String> Arr) {
        ArrayList<StudentData> dataArr = new ArrayList<>();
        try{
            for(int i = 1 ; i<Arr.size();i++) {
                ArrayList<Double> marks = new ArrayList<>();
                String[] fields =  Arr.get(i).split(",");
                for (int j = 2; j < fields.length; j++) {
                    marks.add(Double.valueOf(fields[j]));
                }
                if(marks.size() != 4){
                    System.out.println("Student number: " + i + " has Invalid marks");
                }else{
                    StudentData newStudent = new StudentData(fields[0],fields[1],marks);
                    // after validation set degree and push newStudent to dataArr
                    String message = Validation.IsStudentDataTrue(newStudent);
                    if(message != "valid"){
                        System.out.println("Student number: " + i + " has " +  message);
                    }
                    dataArr.add(newStudent);
                }
            }
            return  dataArr;
        }
        catch(IllegalArgumentException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
