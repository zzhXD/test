package FinallyTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFlag {
    public static String message;
    static
    {
        Input.main(null);
        message = Input.temp;
    };
    public static int flag = 0;//到时候修改为Integer.valueOf(message)
    public static void main(String[] args) {
        String path = "D:";
        File f = new File(path);
        if (!f.exists()) {
            f.mkdirs();
        }
        String filename = "flag.txt";
        File file = new File(path, filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(file);
            message =""+flag;
            byte info[] = message.getBytes();
            os.write(info);
            System.out.print("当前学生人数:");
            System.out.println(flag);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }}
