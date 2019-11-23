package dz;

public class Tiger  extends Creature  implements Run, Climb {

    @Override
    public void run() {
        System.out.println("tiger run");
    }

    @Override
    public void climb() {
        System.out.println("tiger climb");
    }
}
