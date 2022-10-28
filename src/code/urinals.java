package code;

import java.io.*;

public class urinals {

    public String readFile ()
       throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Sem-1\\SER-515\\Assignments\\Assignment-Individual\\ICA-8\\ICA-8\\urinals.dat"))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
}
