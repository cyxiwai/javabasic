package com.xiwai.javacollection;

import java.util.List;
import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.get(3);
//        Object
//        Collections
        List<String> list = new ArrayList<>();
        list.add("xiaobao");
        list.add("love");
        list.add("laogong");
//        list.iterator();
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }


    }


}
