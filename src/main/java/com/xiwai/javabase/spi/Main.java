package com.xiwai.javabase.spi;

public class Main  {
    public static void main(String[] args) {
        LoggerService loggerService = LoggerService.getService();

        loggerService.info("Hello spi");
        loggerService.debug("Hello spi");
    }
}
