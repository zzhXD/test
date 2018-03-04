package FinallyTest;

public class Date {
    private int year;//年份大于1970小于2019
    private int month;//月份在1-12
    private int day;//天在0-31
    public Date(int year,int month,int day){
        this.day = day;
        this.year = year;
        this.month = month;
    }
    public Date(){}

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws YearException {
        if(year>=1970&&year<2019)
        this.year = year;
        else throw new YearException("年份不存在！");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws MonthException {
        if(month<=12&&month>=1)
        this.month = month;
        else throw new MonthException("月份不存在！");
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws DayException {
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {
            if(day>=0&&day<=31)
                this.day=day;
            else throw new DayException("天数不存在！");
        }
        if(month==4||month==6||month==9||month==11)
        {
            if(day>=0&&day<=30)
                this.day=day;
            else throw new DayException("天数不存在！");
        }
        if(month==2)
        {
            if((year%4==0&&year%100!=0)||year%400==0)
            {
                if(day>=0&&day<=29)
                    this.day=day;
                else throw new DayException("天数不存在！");
            }
            else if(day>=0&&day<=28)
                this.day=day;
            else throw new DayException("天数不存在！");
        }

    }

    public String toString(){
        return (year+"  "+month+"  "+day);
    }
    public boolean equals(Object obj){
        obj = (Date) obj;
        return this.year == ((Date) obj).getYear() && this.month == ((Date) obj).getMonth() && this.day == ((Date) obj).getDay();
    }
}
