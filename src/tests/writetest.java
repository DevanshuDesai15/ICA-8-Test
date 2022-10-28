package tests;

import code.urinals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class writetest {

    @Test
    public void checkOutput() throws IOException {
        System.out.println("====== DEVANSHU DESAI == TEST ONE EXECUTED =======");
        urinals uri = new urinals();
        int output = 101010;
        uri.write(output);
        BufferedReader bufferedReader = new BufferedReader(new FileReader("rule.txt"));
        Assertions.assertEquals(bufferedReader.readLine(),String.valueOf(output));
    }
}
