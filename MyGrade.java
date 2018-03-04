package FinallyTest;

import java.util.Scanner;

public class MyGrade {
    public static void main(String[] args) {
        System.out.print("请输入学号:");
        Scanner sc = new Scanner(System.in);
        long id = sc.nextLong();
        for(int i = 0 ;i < MyFlag.flag;i++){
            if(id == Account.student[i].getId()){
                System.out.println(Output.Message[i]);
            }
        }
    }
}
