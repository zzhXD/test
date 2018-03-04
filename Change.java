package FinallyTest;

import FinallyTest.Person.Date;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        System.out.print("请输入您想要改变的学生的学号:");
        Scanner sc = new Scanner(System.in);
        long id = sc.nextLong();
        for (int i = 0; i < MyFlag.flag; i++) {
            if (id == Account.student[i].getId()) {
                System.out.println("请重新输入正确的学生信息以修改");
                long id1 = 0;
                boolean bl = true;
                while(bl){
                    int temp = 0;
                    System.out.print("学号:");
                    id1 = sc.nextLong();
                    sc.nextLine();
                    for(int j = 0;j<MyFlag.flag;j++){
                        if(id1 == Account.student[j].getId()){
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
                double java = sc.nextInt();
                System.out.print("英语:");
                double english = sc.nextInt();
                System.out.println("是否保存？请输入yes或者no(其他字符默认不保存)");
                String choose = sc.nextLine();
                choose = sc.nextLine();
                if (choose.equals("yes")) {
                    Output.Message[i] = id1 + "\t" + name + "\t" + sex + "\t" + year
                            + " " + month + " " + day + "\t" + math
                            + "\t" + java + "\t" + english + "\t" + (math + java + english) / 3;
                    Account.student[i].setId(id1);
                    Account.student[i].people.setName(name);
                    Account.student[i].people.setBirthday(new Date(year,month,day));
                    Account.student[i].setSex(sex);
                    Account.student[i].setMath(math);
                    Account.student[i].setJAVA(java);
                    Account.student[i].setEnglish(english);
                    OutputRight.main(null);
                    System.out.println("修改成功!");
                }
            }
        }
    }
}
