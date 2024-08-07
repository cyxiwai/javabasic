package com.xiwai.javabase.spi;

public class Redis implements DataStorage{
    @Override
    public String search(String key){
        return "Redis "+key+" no";
    }
}
