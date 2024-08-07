package com.xiwai.javacollection;

import java.util.*;

public class solveFindValue {

    public static void main(String[] args) {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 随机删除List中的一个元素:
        Exercise1 exercise1 =new Exercise1();
        Exercise2 exercise2 =new Exercise2();
        int removed = list.remove((int) (Math.random() * list.size()));
        int found1 = exercise1.findMissingNumber(start, end, list);
        int found2 = exercise2.findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found1);
        System.out.println(removed == found1 ? "测试成功" : "测试失败");
        System.out.println(removed == found2 ? "测试成功" : "测试失败");
    }
}


class Exercise1 {
    static int findMissingNumber(int start, int end, List<Integer> list) {
        for(int i=start;i<=end;i++)
        {
            if(i!=list.get(i-10))
            {
                return i;
            }
        }
        return 0;
    }

}

class Exercise2 {
    static int findMissingNumber(int start, int end, List<Integer> list) {
        Integer sumNum=0;
        for(int i:list)
        {
            sumNum+=i;
        }
        Integer ideal=15*11;
        return ideal-sumNum;
    }
}
