package lesson5.interfaces;

public class Human extends Creature implements Runnable, Swimmable {

    @Override
    public void run() {
        System.out.println("human run");
    }

    @Override
    public void swimm() {
        System.out.println("human swimm");
    }
}
