package com.xiwai.javabase.spi;

public class Mysql implements DataStorage{
    @Override
    public String search(String key)
    {
        String temp ="Mysql "+key+" no";
        return temp;
    }
}
