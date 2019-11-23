package lesson5.interfaces;

public class Cat  extends Creature  implements Runnable, Swimmable {


    @Override
    public void run() {
        System.out.println("cat run");
    }

    @Override
    public void swimm() {
        System.out.println("cat swimm");
    }
}


