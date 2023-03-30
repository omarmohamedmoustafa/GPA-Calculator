package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class Parser {

    public static ArrayList <StudentData> parse(ArrayList<String> Arr) {
        ArrayList<StudentData> dataArr = new ArrayList<>();

        try{
            for(int i =1 ; i<Arr.size();i++)
            {
                ArrayList<Double> marks = new ArrayList<>(4);
                String[] fields =  Arr.get(i).split(",");
                for (int j = 2; j < fields.length; j++) {
                    marks.add(Double.valueOf(fields[j]));
              }

                StudentData newStudent = new StudentData(fields[0],fields[1],marks);
            //    System.out.println(newStudent.toString());
                // after validation set degree and push newStudent to dataArr
                Validation.IsStudentDataTrue(newStudent);  //              newStudent.setDegree();
                dataArr.add(newStudent);
            }


        } catch(Error e) {
            System.out.println("Exception: " +e);
        }
        return  dataArr;
    }
}
