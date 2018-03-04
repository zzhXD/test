package FinallyTest.Person;
import java.util.Calendar;
public class Test {
    public static void main(String[] args) {
        People people = new People();
        Date date = new Date();
        Date date_1 = new Date();
        Calendar now = Calendar.getInstance();
        try {
            date.setYear(2000);
            date.setMonth(2);
            date.setDay(29);
            date_1.setYear(2000);
            date_1.setMonth(2);
            date_1.setDay(29);
        }catch (YearException e){
            e.printStackTrace();
        }catch (MonthException e){
            e.printStackTrace();
        }catch (DayException e){
            e.printStackTrace();
        }
        people.setName("zzh");
        try{
            people.setBirthday(date);
            people.setAge(18);

        }catch (AgeException e){
            e.printStackTrace();
        }
        System.out.println(people);
        System.out.println(date.equals(date_1));
        System.out.println(now.get(Calendar.YEAR));
    }

}
