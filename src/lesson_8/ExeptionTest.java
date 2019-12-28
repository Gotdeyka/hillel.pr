package lesson_8;



public class ExeptionTest {
    public ExeptionTest(String user_is_invalid) {
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e){
            System.out.println("Some error" + e.getMessage());
        }
        method2();
    }

    public static void method1() {
        int a = 10/0;

    }

    public static void method2() {
        System.out.println("Everything is good");

    }
}
