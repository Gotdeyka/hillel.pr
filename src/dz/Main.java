package dz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;





public class Main {

    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        callRun(cat);
        callClimb(cat);

        if (cat instanceof Climb) {
            callClimb((Climb) cat);
        } else if (cat instanceof Run) {
            callRun((Run) cat);
        } else if (cat instanceof Fly) {
            callFly((Fly) cat);
        }
//String name;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String h;
        while (!(h = reader.readLine()).equals("")) {
            final int type = Integer.parseInt(h);
            Creature creature = createCreature(type);
            makeActions(creature);
        }
    }

    public static Creature createCreature(final int type) {
        switch (type) {
            case 1:
                return new Cat();
            case 2:
                return new Dog();
            case 3:
                return new Duck();
            case 4:
                return new Tiger();

            default:
                throw new IllegalArgumentException("Unknown creature type");
        }

    }
    public static void makeActions(Creature kkk){
        if(kkk instanceof Climb) callClimb((Climb) kkk);
        if(kkk instanceof Run) callRun((Run) kkk);
        if(kkk instanceof Fly) callFly((Fly) kkk);
    }






    public static void callFly(Fly flyable){
        flyable.fly();
    }

    public static void callRun(Run runnable){
        runnable.run();
    }

    public static void callClimb(Climb climbable) { climbable.climb();
    }
}
