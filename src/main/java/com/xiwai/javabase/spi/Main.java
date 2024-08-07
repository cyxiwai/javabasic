package com.xiwai.javabase.spi;

public class Main  {
    public static void main(String[] args) {
        DataStorage dataStorageRedis = new Redis();
        DataStorage dataStorageMysql = new Mysql();
        System.out.println(dataStorageMysql.search("xiaobao"));
        System.out.println(dataStorageRedis.search("xiaobao"));

    }
}
