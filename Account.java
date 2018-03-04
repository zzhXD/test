package FinallyTest;

import java.util.Date;
import java.util.Scanner;

public class Account {
    private String Id_1 = "627039881";
    private String Screat_1 = "su1314";
    public static Student student[] = new Student[100];
    //public static Date dates[] = new Date[100];
    static {
        for(int i = 0;i<100;i++){
            student[i] =new  Student();
            //dates[i]=new Date();
        }
    }
    public static void main(String[] args) {

        Output output = new Output();
        int temp = 0;
        String Screat_0 = null;
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.print("账号:");
        sc.hasNextLine();//字符串;
        String Id = sc.nextLine();
        if(Id.equals(account.Id_1)){
            while(temp<3){
                System.out.print("密码:");
                sc.hasNextLine();
                Screat_0 = sc.nextLine();
                if(Screat_0.equals(account.Screat_1))
                {
                    System.out.println("登陆成功!");
                    Input.main(null);
                    System.out.println("欢迎进入学生管理系统1.0,请输入数字使用如下功能:");
                    System.out.println("0:离开系统");
                    System.out.println("1:查询所有人成绩");
                    System.out.println("2:按平均分排序并查看");//
                    System.out.println("3:输入id查看个人信息");
                    System.out.println("4:修改成绩");
                    System.out.println("5:增加一名学生");
                    System.out.println("6:删除一名学生");//
                    System.out.print("请输入:");
                    while(!(Id = sc.nextLine()).equals("0")){
                        if (Id.equals("1")){
                            if (MyFlag.flag == 0) {
                                System.out.println("现在还没有学生信息哦，请手动添加");
                            }else
                            Search.main(null);
                        }
                        if (Id.equals("2")){
                           Array.main(null);
                        }
                        if (Id.equals("3")){
                            MyGrade.main(null);
                        }
                        if (Id.equals("4")){
                            Change.main(null);
                        }
                        if (Id.equals("5")){
                            Increase.main(null);
                        }
                        if (Id.equals("6")){
                            Delete.main(null);
                        }
                    }
                    System.out.print("谢谢使用~~");

                  break;
                }else {
                    System.out.println("密码错误!");
                    temp++;
                }
            }
            if(temp == 3)
            System.out.println("连续输入密码错误三次,账号冻结!!!");
        }
    }
}
