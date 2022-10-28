package tests;
import code.urinals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class urinalstest {
    @Test
    public void readTestCheckString() throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter("urinals.dat"));
        br.write("1000011\n1010");
        br.close();
        urinals uri = new urinals();
        String string = uri.readFile();
        string = string.trim();
        Assertions.assertEquals(string, "1000011\n1010");
    }
    @Test
    public void readTestFileNotFoundException() throws IOException {
        File file = new File("urinals.dat");
        if(file.exists())
        {
            file.delete();
        }
        urinals uri = new urinals();
        String string = uri.readFile();
        Assertions.assertEquals(string,"urinals.dat (The system cannot find the file specified)");
    }
}