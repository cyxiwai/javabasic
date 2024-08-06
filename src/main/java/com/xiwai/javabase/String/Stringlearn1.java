package com.xiwai.javabase.String;

public class Stringlearn1 {
    public static void main(String[] args) {
//        String是final修饰的字段，天然不可更改，只能新建后改引用地址，有大量好用api
//    设计原因有三点：保证安全性（不会随意被篡改）；保证hash不频繁变更
//    实现常量池节约内存
//    两种拼接法
        String s="a"+"b"+"c";
//        优化为String s = "abc";
//        变量拼接会被优化为
//        String s = (new StringBuilder(String.valueOf(s))).append(i).toString();

        String s1=s.intern();
        System.out.println(s.equals(s1));
    }


}
