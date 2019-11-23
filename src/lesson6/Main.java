package lesson6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> someList = new ArrayList<User>();

        someList.add(new User("Alina",18));
        someList.add(new User("Marriana",20));
        someList.add(new User("Marriana2",20));
        someList.add(new User("Marriana3",20));
        someList.add(new User("Marriana4",20));
        someList.add(new User("Marriana5",20));
        someList.add(new User("Marriana6",20));
        someList.add(new User("Marriana7",20));
        someList.add(new User("Marriana8",20));
        someList.add(new User("Marriana9",20));

        User[] array = new User[15];


        for(int i = 0; i < someList.size(); i++ ){
            array[i] = someList.get(i);
        }

        System.out.println();
        System.out.println("Print list");
        for (User object: someList){
            System.out.print(object.getName() + " ");
        }

        System.out.println();
        System.out.println("Print array");
        for(int i = 0; i < array.length; i++ ){
            System.out.print(array[i] + " ");
        }

        someList.add(4,new User("Vasia", 12));

        System.out.println();
        System.out.println("Print list");
        for (User object: someList){
            System.out.print(object.getName() + " ");
        }

        array[4] = someList.get(4);

        System.out.println();
        System.out.println("Print list after remove by index");
        for(int i = 0; i < array.length; i++ ){
            System.out.print(array[i] + " ");
        }

        array[4] = null;

        System.out.println();
        System.out.println("Print list after delete by index");
        for(int i = 0; i < array.length; i++ ){
            System.out.print(array[i] + " ");
        }
    }


}
