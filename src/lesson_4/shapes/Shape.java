package lesson_4.shapes;

public abstract class Shape {

    public Shape(){

    }

    public Shape(String color) {
       this.color = color;
    }

    protected String color;
    protected int size;

    public void draw() {
        //  System.out.println("Draw shape");
        this.drawShape();
    }

    public void fill() {
        System.out.println("Fill " + this.color);
    }

    private void drawShape() {
        System.out.println("Draw Logic for any shape");
        System.out.println("Play music");
    }

}
