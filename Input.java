package FinallyTest;

import java.io.*;

public class Input {
    public static String temp = "";
    public static void main(String[] args) {
        File file = new File("D:flag.txt");
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            temp = InputToString.readInputStream(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}