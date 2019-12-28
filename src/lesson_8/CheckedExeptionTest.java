package lesson_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExeptionTest {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {

        System.out.println("method 1 started");
        try {
            method2();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException {
        System.out.println("1");
        System.out.println("2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(reader.readLine());
        System.out.println(a);


    }
}
