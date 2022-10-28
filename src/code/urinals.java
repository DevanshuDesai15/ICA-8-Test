package code;

import java.io.*;

public class urinals {

    public String readFile() {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("urinals.dat"))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
            return resultStringBuilder.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
