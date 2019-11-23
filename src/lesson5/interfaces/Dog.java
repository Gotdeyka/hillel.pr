package lesson5.interfaces;

public class Dog  extends Creature  implements Runnable, Swimmable {

    @Override
    public void run() {
        System.out.println("dog run");
    }

    @Override
    public void swimm() {
        System.out.println("dog swimm");
    }




}
