package FinallyTest;

import FinallyTest.Person.Date;
import FinallyTest.Person.People;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output {
    public static String Message[] = new String[100];
    public static Account account = new Account();
    public static void main(String[] args) {

        Student student_1 = new Student( new People("zzh",new Date(1999,9,24)),91,80,93,(91+80+93)/3,"男",20174453);
        Student student_2 = new Student( new People("rry",new Date(1999,8,1)),66,99,90,(90+99+67)/3,"男",20174455);
        File file = new File("D:stu.txt");
        FileOutputStream os = null;

        Message[0] = student_1.getId()+"\t"+student_1.people.getName()+"\t"+student_1.getSex()+"\t"+student_1.people.getBirthday().getYear()
                +" "+student_1.people.getBirthday().getMonth()+" "+student_1.people.getBirthday().getDay()+"\t"+student_1.getMath()
                +"\t"+student_1.getJAVA()+"\t"+student_1.getEnglish()+"\t"+student_1.getAverage();
        Message[1] = student_2.getId()+"\t"+student_2.people.getName()+"\t"+student_2.getSex()+"\t"+student_2.people.getBirthday().getYear()
                +" "+student_2.people.getBirthday().getMonth()+" "+student_2.people.getBirthday().getDay()+"\t"+student_2.getMath()
                +"\t"+student_2.getJAVA()+"\t"+student_2.getEnglish()+"\t"+student_2.getAverage();
        try {
             os = new FileOutputStream(file);
             String message = "";
             for(int i = 0;i < MyFlag.flag;i++){
                 message += (Message[i]+"\r\n");
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
