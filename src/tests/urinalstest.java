package tests;
import code.urinals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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

}