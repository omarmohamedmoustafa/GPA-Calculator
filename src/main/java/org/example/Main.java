package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
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
        Parser.parse(Arr);

//           //Parser parser = new Parser(bufread);
//            //ArrayList<StudentData> data = parser.parse();
//            // reading the file, line by line
//            for(int i = 0 ; i < data.size(); i++ ) {
//                StudentData sData = data.get(i);
//
//                PrintWriter out = new PrintWriter("out.txt");
//                out.println('n');
//
//                System.out.println(sData.getGpa().toString() + ' ' + sData.getGrade()  + ' ' + sData.getName());
//            }
////            while((myline = bufread.readLine()) != null)
////                System.out.println(myline);
//
//            bufread.close();

    }
}
//
//    static void outToFile() {
//        try {
//            File path = new File("C:\\Users\\moham\\IdeaProjects\\gpa-calculator\\outh.txt");
//
//            //passing file instance in filewriter
//            FileWriter wr = new FileWriter(path);
//
//            //calling writer.write() method with the string
//            wr.write("Geeks for Geeks \nWelcome to computer science portal \nHello Geek!!");
//
//            //flushing the writer
//            wr.flush();
//
//            //closing the writer
//            wr.close();
//        } catch (Error | IOException e) {
//            System.out.println("Hi");
//        }
//    }
//}