package my_dz;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        int win1 = 0;
        int win2 = 0;

        if (this.strength == anotherCat.strength){
            win1++;
            win2++;
        }
        else {
            if (this.strength > anotherCat.strength)
                win1++;
            else
                win2++;
        }
        if (this.age == anotherCat.strength){
            win1++;
            win2++;
        }
        else{
            if (this.age > anotherCat.age)
                win1++;
            else
                win2++;
        }
        if (this.weight == anotherCat.weight){
            win1++;
            win2++;
        }
        else{
            if (this.weight > anotherCat.weight)
                win1++;
            else
                win2++;
        }

        if (win1 == win2){
            System.out.println("ничья");
            return false;
        }
        else
            return win1 > win2;

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.age = 1;
        cat1.weight = 2;
        cat1.strength = 6;

        cat2.age = 2;
        cat2.weight = 5;
        cat2.strength = 6;


        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}