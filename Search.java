package FinallyTest;

import java.io.*;

public class Search {
    public static void main(String[] args) {
        File file = new File("D:stu.txt");
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            byte[] flush = new byte[1024];
            int len = 0;
            String message = "";
            while(-1 != (len = in.read(flush))){
                message = new String(flush);
                MyFlag.main(null);
                System.out.println(message);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
