package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class getFileTest {

    @Test
    void fileRead_PositiveScenario() {
        String [] Arr0 =  {"John Doe","Jane Smith","Bob Johnson"};
        assertArrayEquals(Arr0, getFile.FileRead("getFileTest1.txt").toArray(),"Failed @ : fileRead_PositiveScenario ");
    }

    @Test
    void fileRead_EmptyLine() {
        String [] Arr0 =  {"John Doe","","Bob Johnson"};
        assertArrayEquals(Arr0, getFile.FileRead("getFileTest2.txt").toArray(),"Failed @ : fileRead_EmptyLine ");
    }
}