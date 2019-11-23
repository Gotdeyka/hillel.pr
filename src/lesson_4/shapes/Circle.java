package lesson_4.shapes;

public class Circle extends Shape {


    public Circle(){

    }

    @Override
    public void fill() {
        super.draw();
        System.out.println("Draw circle");
    }
}
