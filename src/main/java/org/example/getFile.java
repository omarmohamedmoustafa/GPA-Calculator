package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class getFile {

    public static ArrayList<String> FileRead (String path){

        String myline;
        ArrayList<String> fileData = new ArrayList<>();
        try{
            FileReader getFile = new FileReader(path);

            BufferedReader bufread = new BufferedReader(getFile);

            while((myline = bufread.readLine()) != null) {
                fileData.add(myline);
            }
        } catch(IOException e) {
            System.out.println("Exception: " +e);
        }
        return fileData;

    }
}
