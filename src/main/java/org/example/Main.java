package org.example;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
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
        ArrayList<StudentData> data =  Parser.parse(Arr);

        outToFile(data , subjectData);
    }


    static void outToFile(ArrayList<StudentData> data ,String[] subjectData ) {
        try {
            File path = new File("out.txt");
            PrintWriter out = new PrintWriter(new FileWriter(path, true));
            out.print("");

            out.printf("---------------------------------------------------------------------\n");
            out.printf("%-30s%-30s%-30s%n","Subject name: "+subjectData[0],"Subject code: "+subjectData[1],"Max mark: "+subjectData[2]);
            out.printf("********************************************\n");
            out.printf("\n");
            out.printf("%-20s%-20s%-20s%-15s%n","Student name","Student number","GPA","Grade");
            out.printf("---------------------------------------------------------------------\n");
            for(int i = 0 ; i <data.size() ; i++){
                String[] s = data.get(i).ToString();
                out.printf("%-20s%-20s%-20s%-15s%n",s[0],s[1],s[2],s[3]);
            }
            out.printf("---------------------------------------------------------------------\n");
            out.printf("\n\n\n=========================================================================\n\n\n");
            out.flush();
            out.close();

        } catch (Error | IOException e) {

        }
    }
}