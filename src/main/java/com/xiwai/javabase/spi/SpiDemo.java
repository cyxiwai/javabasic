package com.xiwai.javabase.spi;
import java.util.ServiceLoader;

public class SpiDemo {
    public static void main(String[] args) {
        ServiceLoader<DataStorage> serviceLoader=ServiceLoader.load(DataStorage.class);
        serviceLoader.forEach(loader -> System.out.println(loader.search("xiaobao")));
    }
}
