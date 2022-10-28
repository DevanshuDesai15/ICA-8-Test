package tests;
import code.urinals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class urinalstest {
    @Test
    public void readTestCheckString() throws IOException {
        System.out.println("====== DEVANSHU DESAI == TESTS BELOW EXECUTED =======");
        BufferedWriter br = new BufferedWriter(new FileWriter("urinals.dat"));
        br.write("1000011\n1010");
        br.close();
        urinals uri = new urinals();
        String string = uri.readFile();
        string = string.trim();
        Assertions.assertEquals(string, "1000011\n1010");
    }
    @Test
    public void readTestFileNotFoundException()  {
        System.out.println("====== DEVANSHU DESAI == TESTS BELOW EXECUTED =======");

        File file = new File("urinals.dat");
        if(file.exists())
        {
            file.delete();
        }
        urinals uri = new urinals();
        String string = uri.readFile();
        Assertions.assertEquals(string,"urinals.dat (The system cannot find the file specified)");
    }
    @Test
    public void readTestEmptyFile() throws IOException {
        System.out.println("====== DEVANSHU DESAI == TESTS BELOW EXECUTED =======");

        File file = new File("urinals.dat");
        if(file.exists())
        {
            file.delete();
        }
        file.createNewFile();
        urinals uri = new urinals();
        String string = uri.readFile();
        string = string.trim();
        Assertions.assertTrue(string.isEmpty());
    }
    @Test
    public void readTestNumberFormat() throws IOException {
        System.out.println("====== DEVANSHU DESAI == TESTS BELOW EXECUTED =======");

        BufferedWriter br = new BufferedWriter(new FileWriter("urinals.dat"));
        br.write("abcd\n101010");
        br.close();
        urinals uri = new urinals();
        String string = uri.readFile();
        string = string.trim();
        Assertions.assertEquals(string,"For input string: \"abcd\"");
    }
}