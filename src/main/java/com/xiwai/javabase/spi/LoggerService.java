package com.xiwai.javabase.spi;

import java.util.List;
import java.util.ServiceLoader;
import java.util.ArrayList;

public class LoggerService {
    private static final LoggerService SERVICE = new LoggerService();
    private final Logger logger;
    private final List<Logger> loggerList;

    public LoggerService() {
        ServiceLoader<Logger> loader = ServiceLoader.load(Logger.class);
        List<Logger> list = new ArrayList<>();
        for (Logger log : loader) {
            list.add(log);
        }
        loggerList = list;
        if (!list.isEmpty()) {
            logger = list.get(0);
        } else {
            logger = null;
        }

    }

    public static LoggerService getService() {
        return SERVICE;
    }

    public void info(String msg) {
        if (logger == null) {
            System.out.println("info未发现logger服务提供者");
        } else {
            logger.info(msg);
        }
    }

    public void debug(String msg) {
        if (logger == null) {
            System.out.println("debug未发现logger服务提供者");
        } else {
            logger.debug(msg);
        }
    }


}
