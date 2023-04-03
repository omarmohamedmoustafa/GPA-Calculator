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
        Arr = getFile.FileRead(path);
        String str1 = Arr.get(0);
        Arr.remove(0);
        String[] fields =  str1.split(",");
        Validation.IsStubjectDataTrue(fields);
        ArrayList<StudentData> data =  Parser.parse(Arr);
        String str = "subject name : " + fields[0] + "(" + fields[1] + ")" + " total mark:" + fields[2] + "\n";//str1 + "\n";
        for(int i = 0 ; i < data.size(); i++ ) {
            StudentData sData = data.get(i);
            str +=   "Student name : "+ sData.getName() + "\t" +
                     "Student ID : "+ sData.getId() + "\t"+ 
                     "Student Gpa : "+sData.getGpa().toString() +",,," + 
                     "Student grade : "+sData.getGrade()  + "\n";
        }
        System.out.println(str);
        outToFile(str);
    }
    static void outToFile(String str) {
        try {
            File path = new File("C:\\Users\\aliel\\Desktop\\testing project\\gpa-calculator\\outh.txt");

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