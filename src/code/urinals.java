package code;

import java.io.*;
import java.util.Scanner;

public class urinals {

    public static void  main(String  args[]) throws IOException {
        System.out.println("Input from 1.) file or 2.) CMD");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1)
        {
            String ouput = readFile();
            String lines[] = ouput.split("\\r?\\n");
            for (String input : lines)
            {
                int result = getUnoccupiedUrinals(input);
                write(result);
            }
        }
        else if(n==2)
        {
            System.out.println("Enter one urinal input:- ");
            String input = sc.next();
            int result = getUnoccupiedUrinals(input);
            System.out.println("Final Result:- "+result);
        }
        else {
            System.out.println("Enter valid Input");
        }
    }
    public static String readFile() {
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

    public static void write(int output) throws IOException {
        String fileName = "rule.txt";
        File file = new File(fileName);
        if(!file.exists())
        {
            file.createNewFile();
        }
        else {
            int i = 1;
            while(file.exists())
            {
                fileName = "rule"+String.valueOf(i)+".txt";
                i++;
                file = new File(fileName);
            }
            file.createNewFile();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.append(String.valueOf(output));
        writer.close();
    }
}
