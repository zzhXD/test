package FinallyTest;

import FinallyTest.Person.People;

public class Student {
    People people = new People();
    private double Math;
    private double JAVA;
    private double English;
    private long id;
    private String sex;
    private double average;
    public Student(){}
    public Student(People people,double Math,double JAVA,double English,double average,String sex,long id){
        this.people = people;
        this.Math = Math;
        this.id= id;
        this.sex = sex;
        this.average = average;
        this.English = English;
        this.JAVA = JAVA;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
//        String result = String.format("%.2f",average);
//        Double aver = Double.parseDouble(result);
        this.average = average;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double math) {
        Math = math;
    }

    public double getJAVA() {
        return JAVA;
    }

    public void setJAVA(double JAVA) {
        this.JAVA = JAVA;
    }

    public double getEnglish() {
        return English;
    }

    public void setEnglish(double english) {
        English = english;
    }
}



