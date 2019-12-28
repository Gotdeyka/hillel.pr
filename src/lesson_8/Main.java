package lesson_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        method1();
        System.out.println("main");
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    public static void method1() {
        method2();
        System.out.println("method1");
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    public static void method2() {
        method3();
        System.out.println("method2");
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    public static void method3() {
        method4();
        System.out.println("method3");
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    public static void method4() {
        System.out.println("method4");
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
    }
}
