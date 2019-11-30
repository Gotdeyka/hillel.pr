package lesson_7;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("cat");
        set.add("cat1");
        set.add("cat2");

        for (String ss: set){
            System.out.println(ss);
        }

        set.remove("cat");
        System.out.println("__________");

        for (String ss: set)
        System.out.println(ss);

        System.out.println("_________________");
        System.out.println( set.contains("cat"));
        System.out.println("_________________");
        System.out.println( set.contains("cat2"));
    }
}
