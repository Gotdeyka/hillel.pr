package lesson5.interfaces;

import lesson5.ChessAbstract;
import lesson5.King;
import lesson5.Queen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;





public class Main {

    public static void main(String[] args) throws IOException {
        Human human = new Human();
        callRun(human);
        callSwimm(human);

        if (human instanceof Swimmable) {
            callSwimm((Swimmable) human);
        } else if (human instanceof Runnable) {
            callRun((Runnable) human);
        } else if (human instanceof Flyable) {
            callFly((Flyable) human);
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
                return new Human();
                case 2:
                    return new Dog();
                case 3:
                    return new Cat();

                default:
                    throw new IllegalArgumentException("Unknown creature type");
            }

    }
public static void makeActions(Creature kkk){
    if(kkk instanceof Swimmable) callSwimm((Swimmable) kkk);
    if(kkk instanceof Runnable) callRun((Runnable) kkk);
    if(kkk instanceof Flyable) callFly((Flyable) kkk);
}






    public static void callFly(Flyable flyable){
        flyable.fly();
    }

    public static void callRun(Runnable runnable){
        runnable.run();
    }

    public static void callSwimm(Swimmable swimmable){
        swimmable.swimm();
    }
}
