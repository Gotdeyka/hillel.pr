package Lesson_7_dz.dz1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> someList = new ArrayList<User>();

        // 6 do 9 - leto

        someList.add(new User("Alina",6));
        someList.add(new User("Marriana",10));
        someList.add(new User("Marriana2",10));
        someList.add(new User("Marriana3",3));
        someList.add(new User("Marriana4",4));
        someList.add(new User("Marriana5",5));
        someList.add(new User("Marriana6",10));
        someList.add(new User("Marriana7",11));
        someList.add(new User("Marriana8",12));
        someList.add(new User("Marriana9",1));

        User[] array = new User[15];


        for(int i = 0; i < someList.size(); i++ ){
            array[i] = someList.get(i);
        }

        System.out.println();
        System.out.println("Print list");
        for (User object: someList){
            System.out.print(object.getName() + " ");
        }



        array[0] = null;

        System.out.println();
        System.out.println("Print list after delete by index");
        for(int i = 0; i < array.length; i++ ){
            System.out.print(array[i] + " ");
        }
    }


}