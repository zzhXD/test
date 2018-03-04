package FinallyTest.Person;
import java.util.Calendar;
public class People {
    private String name;
    private int age;
    private Date birthday;
    private Calendar now = Calendar.getInstance();
    public People(String name,Date birthday){
          this.name = name;
          this.birthday = birthday;
    }

    public People(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if((birthday.getYear()+age)==now.get(Calendar.YEAR))
        this.age = age;
        else throw new AgeException("年龄与出生日期不符！");
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String toString(){
     return ("名字："+name+"  年龄："+age+"  出生日期："+birthday.toString());
    }

}
