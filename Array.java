package FinallyTest;


public class Array {
    public static void main(String[] args) {
        for(int i = 0;i<MyFlag.flag;i++){
            for(int j = 0;j<MyFlag.flag-i-1;j++){
             if(Account.student[j].getAverage()<Account.student[j+1].getAverage()){
                 Account.student[99]=Account.student[j];
                 Account.student[j]=Account.student[j+1];
                 Account.student[j+1]=Account.student[99];
                 Output.Message[99]=Output.Message[j];
                 Output. Message[j]=Output.Message[j+1];
                 Output.Message[j+1]=Output.Message[99];
             }
            }
        }
        OutputRight.main(null);
        Search.main(null);
    }
}
