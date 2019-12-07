package Lesson_7_dz.dz1;

import java.util.*;

public class Programm{

    public static void main(String[] args) {

        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Summer");
        states.put(2, "Spring");
        states.put(4, "Winter");
        states.put(3, "Autumn");

        for (Map.Entry<Integer, String> item : states.entrySet()) {

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        System.out.println("After removal:");

        states.remove(1);

        for (Map.Entry<Integer, String> item : states.entrySet()) {

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

    }}