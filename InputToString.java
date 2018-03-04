package FinallyTest;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class InputToString {
    public static String readInputStream(InputStream in){
        try {
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            int length=0;
            byte[] buffer=new byte[1024];
            while((length=in.read(buffer))!=-1){
                baos.write(buffer, 0, length);
            }
            in.close();
            baos.close();
            String b=baos.toString();
            char a[]= new char[100];
            for(int i=0;i<1;i++){
                a[i]= b.charAt(i);
            }
            for(int i=0;i<1;i++){
            }
            String e = ""+a[0];
            return e;
        } catch (Exception e) {
            e.printStackTrace();
            return "获取失败";
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:flag.txt");
        InputStream in = null;
        in = new FileInputStream(file);
            System.out.println(readInputStream(in));
    }
}
