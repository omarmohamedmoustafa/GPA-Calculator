package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        path = scan.nextLine();

        //outToFile();
        ArrayList<String> Arr = new ArrayList<>();
        //get data from file
        Arr = getFile.FileRead(path);

        String[] subjectData = Parser.getSubjectInfo(Arr);
//        System.out.println("Subject Name: " + subjectData[0] + "," + "Subject Code: " + subjectData[1] +", Subject Marks: " + subjectData[2]);
        ArrayList<StudentData> data =  Parser.parse(Arr);
//        System.out.println();
//        for (int i = 0; i < data.size(); i++) {
//            System.out.println(data.get(i).toString());
//        }
        String str = "Subject Name: " + subjectData[0] + "," + "Subject Code: " + subjectData[1] +", Max Mark: " + subjectData[2]+"\n";
        str += "Student name    Student number      GPA     Grade\n";
        for(int i = 0 ; i < data.size(); i++ ) {
            str += data.get(i).toString() + "\n";
            //System.out.println(data.get(i).toString());
        }
        //System.out.println(str);
        outToFile(str);
    }
    static void outToFile(String str) {
        try {
            File path = new File("out.txt");

            //passing file instance in filewriter
            FileWriter wr = new FileWriter(path);

            //calling writer.write() method with the string
            wr.write(str);

            //flushing the writer
            wr.flush();

            //closing the writer
            wr.close();

        } catch (Error | IOException e) {

        }
    }
}