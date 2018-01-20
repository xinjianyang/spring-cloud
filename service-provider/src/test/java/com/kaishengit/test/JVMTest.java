package com.kaishengit.test;

/**
 * @author NativeBoy
 */
public class JVMTest {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
    }
}
