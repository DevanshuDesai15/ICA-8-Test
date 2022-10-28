package code;

import java.io.*;

public class urinals {

    public String readFile() {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("urinals.dat"))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                }
                catch (Exception e)
                {
                    return e.getMessage();
                }
                resultStringBuilder.append(line).append("\n");
            }
            return resultStringBuilder.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public static int getUnoccupiedUrinals(String urnal){
        if (urnal.contains("11")) return -1;
        if(urnal.length()>20) return -2;
        if(urnal.length()<1) return -3;
        if (urnal.equals("0")) return 1;
        if (urnal.equals("1")) return 0;

        char[] find_urinals = urnal.toCharArray();
        int counter = 0;

        for (int i = 0; i < find_urinals.length - 1; i++) {
            if (i == 0) {
                if (find_urinals[i] == '0' && find_urinals[i + 1] == '0') {
                    find_urinals[i] = '1';
                    counter++;
                }
            }
            if (i > 0) {
                if (find_urinals[i] == '0' && find_urinals[i - 1] == '0' && find_urinals[i + 1] == '0') {
                    find_urinals[i] = '1';
                    counter++;
                }
            }
        }
        if (find_urinals[find_urinals.length - 1] == '0' && find_urinals[find_urinals.length - 2] == '0') {
            counter++;
        }
        return counter;
    }

}
