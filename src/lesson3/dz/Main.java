package lesson3.dz;

public class Main {
    public static void main(String[] args) {
        String s1 = StringHelper.multiply("Hello");
    }
}
class  StringHelper {
    public static String multiply(String string) {
        return String.valueOf(string).repeat(5);
    }

    public static String multiply(String string, int count) {
        return String.valueOf(string).repeat(count);
    }


}