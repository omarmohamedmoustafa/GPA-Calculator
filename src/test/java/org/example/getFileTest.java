package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class getFileTest {

    @Test
    void fileRead() {
        String [] Arr0 =  {"1John Doe","","Doe John"};

        String [] Arr1 =  {"John Doe", "ssss","Doe John"};

        String [] Arr2 =  {"John Doe", "1", "Doe John"};

        assertAll(

                () -> assertArrayEquals(Arr0, getFile.FileRead("test.txt").toArray(), "Hi"),
                () -> assertArrayEquals(Arr1, getFile.FileRead("test.txt").toArray(),"Bye"),
                () -> assertArrayEquals(Arr2, getFile.FileRead("test.txt").toArray())
        );
    }
}