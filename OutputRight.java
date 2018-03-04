package FinallyTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputRight extends Output{
    public static void main(String[] args) {
        File file = new File("D:stu.txt");
        FileOutputStream os = null;
        //MyFlag.flag =
        try {
            os = new FileOutputStream(file);
            String message = "";
            for(int i = 0;i < MyFlag.flag;i++) {
                if (Message[i] != null) {
                    message += (Message[i] + "\r\n");
                }
            }
            byte info[] = message.getBytes();
            os.write(info);
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
    }
}