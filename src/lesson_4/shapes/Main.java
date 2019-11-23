package lesson_4.shapes;

public class Main {

    public static void main(String[] args){


        Circle circle = new Circle();
        circle.draw();
        circle.fill();

        System.out.println("--------------");

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.fill();
    }
}
