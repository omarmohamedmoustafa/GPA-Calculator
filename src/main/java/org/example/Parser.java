package org.example;

import java.io.BufferedReader;


import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;
public class Parser {
    private BufferedReader bufread;
    Parser(BufferedReader bufread) {
        this.bufread = bufread;
    }

    ArrayList<StudentData> parse() {
        String myline;
        ArrayList<StudentData> dataArr = new ArrayList<>();

        try{
            while((myline = this.bufread.readLine()) != null) {
                System.out.println(myline);
                String[] fields =  myline.split(",");
                for (int i = 0; i < fields.length; i++) {
                    System.out.println("Field " + i + " " + fields[i]);
                }
                System.out.println(fields);
                //John Doe,12345678,8,9,18,50
                String name = fields[0];
                String id = fields[1];
                ArrayList<Double> marks = new ArrayList<>(4);
                for (int i = 2; i < fields.length; i++) {
                    marks.add(Double.valueOf(fields[i]));
                    System.out.println(Double.valueOf(fields[i]));
                    System.out.println(fields[i]);
                }
                StudentData studentData = new StudentData();
                studentData.setId(id);
                studentData.setName(name);
                studentData.setMarks(marks);
                dataArr.add(studentData);
            }

        } catch(IOException e) {
            System.out.println("Exception: " +e);
        }
        return  dataArr;
    }
}
