package com.acme.edu;

public class Logger {
    private static final String PRIMITIVE_PREFIX = "primitive: ";

    public static void log(int message) {
        print(PRIMITIVE_PREFIX + message);
    }

    public static void log(byte message) {
        print(PRIMITIVE_PREFIX + message);
    }

    public static void log(char message) {
        print("char: " + message);
    }

    public static void log(String message) {
        print("string: " + message);
    }

    private static void print(String message) {
        System.out.println(message);
    }
}
