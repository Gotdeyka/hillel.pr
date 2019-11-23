package lesson3;

public class Equals {


    public static void main(String[] args) {
        Cat cat = new Cat("test", 1);
        Cat cat1 = new Cat("test", 2);


        System.out.println(cat);
        System.out.println(cat1);

        if (cat.equals(cat1)){
            System.out.println("cat = cat1");
        }
        else{
            System.out.println("cat != cat1");
        }

        cat1.fight(cat);

        System.out.println(cat);
        System.out.println(cat1);



    }
}