package lesson3.dz;

public class Util {
    public static void main(String[] args) {
        System.out.println(Util1.getDistance(10, 5, 4, 3));
    }

}
class Util1 {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}