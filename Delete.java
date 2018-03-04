package FinallyTest;

import java.io.File;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        File file = new File("D:stu.txt");
        System.out.print("请输入想要删除的学生的学号:");
        Scanner sc = new Scanner(System.in);
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("确定要删除它吗，yes或no(其他字符默认no)");
        String choose = sc.nextLine();
        if(choose.equals("yes")){
            for(int i = 0;i<MyFlag.flag;i++){
                if(id == Account.student[i].getId()){
                    for(int j=i;Output.Message[j+1]!=null;j++){
                        Account.student[j] = Account.student[j+1];
                        Output.Message[j] = Output.Message[j+1];
                    }
                    MyFlag.flag--;
                    OutputRight.main(null);
                }
            }
        }else{
            System.out.println("看来它还是有用的");
        }


    }
}
