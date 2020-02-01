package lesson3.dz;

public class Tom_Jerry {
    public static void main(String[] args) {
        Cat catTom = new Cat("Tom", 5, "grey");
        Cat catTopsi = new Cat("Topsi", 10, "redhead");
        Mouse mouseJerry = new Mouse("Jerry", 11, "brown");
        Mouse mouseTaffi = new Mouse("Taffi");


    }
}

class Cat {
    private static final String DEFAULT_COLOUR = "red";
    private static final int DEFAULT_AGE = 4;
    String name, colour = DEFAULT_COLOUR;
    int age = DEFAULT_AGE;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }


    public Cat(String name, int age) {
        this(name);
        if (age <= 0) throw new IllegalArgumentException("Height must be more than zero");
        else this.age = age;
    }

    public Cat(String name, int age, String colour) {
        this(name, age);
        this.colour = colour;
    }

}

class Mouse {
    private static final String DEFAULT_COLOUR = "red";
    private static final int DEFAULT_AGE = 4;
    String name, colour = DEFAULT_COLOUR;
    int age = DEFAULT_AGE;

    public Mouse() {
    }

    public Mouse(String name) {
        this.name = name;
    }



    public Mouse(String name, int age) {
        this(name);
        if (age <= 0) throw new IllegalArgumentException("Height must be more than zero");
        else this.age = age;
    }

    public Mouse(String name, int age, String colour) {
        this(name, age);
        this.colour = colour;
    }

}
