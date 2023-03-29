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

    }
}