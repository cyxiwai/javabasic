package com.xiwai.javabase.fanshe;

public class fanshe {
    public static void main(String[] args) throws ClassNotFoundException{

//    class fansheClass=fanshe1.class;
//语法错误
        Class fansheclass = fanshe1.class;
        Class fansheclass2= Person1.class;
        Class ceshilujingclass=Class.forName("com.xiwai.javabase.fanshe.Person1");

    }
}



class Person1{
    private String name;
    public Person1(){};
    public Person1(String name ){
        this.name=name;
    }

}