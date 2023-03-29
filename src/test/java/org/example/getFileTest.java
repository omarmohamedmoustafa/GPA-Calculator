package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class getFileTest {

    @Test
    void fileRead() {
        String [] Arr0 =  {"John Doe","Doe John", ""};

        String [] Arr1 =  {"John Doe", "","Doe John"};

        String [] Arr2 =  {"John Doe", "1", "Doe John"};

        assertAll(

                () -> assertArrayEquals(Arr0, getFile.FileRead("test.txt").toArray()),
                () -> assertArrayEquals(Arr1, getFile.FileRead("test.txt").toArray()),
                () -> assertArrayEquals(Arr2, getFile.FileRead("test.txt").toArray())
        );
    }
}