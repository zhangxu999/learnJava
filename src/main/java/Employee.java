import java.io.*;

public class Employee{
    public String name;
    int age;
    String designation;
    private double salary;
    // Employee 类的构造器
    public Employee(String name){
        this.name = name;
    }
    // 设置age的值
    public void empAge(int empAge){
        age =  empAge;
    }
    /* 设置designation的值*/
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    /* 设置salary的值*/
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    /* 打印信息 */
    public void printEmployee(){
        System.out.println("名字:"+ name );
        System.out.println("年龄:" + age );
        System.out.println("职位:" + designation );
        System.out.println("薪水:" + salary);
    }
}

class Test{
    final int value = 10;
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";
    public void changeValue(){
        value = 12;

    }
}
abstract class Caravan{
    private double price;
    private String model;
    private String year;
    public abstract void goFast();
    public abstract void changeColor();
}