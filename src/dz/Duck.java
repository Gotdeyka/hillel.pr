package dz;

public class Duck  extends Creature  implements Run, Climb, Fly {

    @Override
    public void run() {
        System.out.println("duck run");
    }

    @Override
    public void climb() {
        System.out.println("duck climb");
    }

    @Override
    public void fly() {
        System.out.println("duck fly");
    }
}