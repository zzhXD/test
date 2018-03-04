package FinallyTest;

import FinallyTest.Person.Date;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Increase {
    public static void main(String[] args) {
        String path = "D:";
        File f = new File(path);
        if (!f.exists()) {
            f.mkdirs();
        }
        String filename = "stu.txt";
        File file = new File(path, filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //File file = new File("D:stu.txt");
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        long id = 0;
        boolean bl = true;
        MyFlag.flag++;
        System.out.println("请输入新学生信息:");
        while(bl){
            int temp = 0;
            System.out.print("学号:");
            id = sc.nextLong();
            sc.nextLine();
            for(int i = 0;i<MyFlag.flag;i++){
                if(id == Account.student[i].getId()){
                    System.out.println("学号不可以重复，请重新输入");
                }else {
                    temp++;
                }
            }
            if(temp == MyFlag.flag){
                bl = false;
            }
        }
        System.out.print("名字:");
        String name = sc.nextLine();
        System.out.print("性别:");
        String sex = sc.nextLine();
        System.out.print("年:");
        int year = sc.nextInt();
        System.out.print("月:");
        int month = sc.nextInt();
        System.out.print("日:");
        int day = sc.nextInt();
        System.out.print("数学:");
        double math = sc.nextInt();
        System.out.print("java:");
        double java = sc.nextInt();;
        System.out.print("英语:");
        double english = sc.nextInt();
        System.out.println("是否保存？请输入yes或者no(其他字符默认不保存)");
        String choose = sc.nextLine();
        choose = sc.nextLine();
        if (choose.equals("yes")){
            Output.Message[MyFlag.flag-1] = id+"\t"+name+"\t"+sex+"\t"+year
                    +" "+month+" "+day+"\t"+math
                    +"\t"+java+"\t"+english+"\t"+(math+java+english)/3;
            Account.student[MyFlag.flag-1].setId(id);
            Account.student[MyFlag.flag-1].people.setName(name);
            Account.student[MyFlag.flag-1].people.setBirthday(new Date(year,month,day));
            Account.student[MyFlag.flag-1].setSex(sex);
            Account.student[MyFlag.flag-1].setMath(math);
            Account.student[MyFlag.flag-1].setJAVA(java);
            Account.student[MyFlag.flag-1].setEnglish(english);
            Account.student[MyFlag.flag-1].setAverage((math+java+english)/3);
            OutputRight.main(null);
            System.out.println("添加成功!");
        }else if (choose.equals("no")){
            MyFlag.flag--;
            OutputRight.main(null);
        }else {
            MyFlag.flag--;
            OutputRight.main(null);
        }
            MyFlag.main(null);
    }
}
