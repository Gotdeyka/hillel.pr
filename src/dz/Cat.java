package dz;

public class Cat  extends Creature  implements Run, Climb {

    @Override
    public void run() {
        System.out.println("cat run");
    }

    @Override
    public void climb() {
        System.out.println("cat climb");
    }

}

