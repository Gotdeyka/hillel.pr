package lesson3;

public class Cat {
    //   String string = "test" + "test1";

    public static void main(String[] args) {

    }

    private static int CAT_COUNT;

    public static final String DEFAULT_NAME = "Murchik";
    public static final int LIVES = 9;

    private String name;
    private int age;
    private int lives = LIVES;


    public Cat() {
        this.name = DEFAULT_NAME;
        CAT_COUNT++;
    }

    public Cat(String name) {
        if (name == null) {
            this.name = DEFAULT_NAME;
        } else {
            this.name = name;
        }
        CAT_COUNT++;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        CAT_COUNT++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public static int getCatCount() {
        return CAT_COUNT;
    }

    public Cat(String name, int age, int lives) {
        this.name = name;
        this.age = age;
        this.lives = lives;
    }


    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{name=" + this.name + ", age=" + this.age + "lives" + this.lives + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;
        return age == cat.age &&
                lives == cat.lives &&
                name.equals(cat.name);
    }


    public void fight (Cat cat){
        if (this.age > cat.age){
            cat.lives = 0;
        }else if(cat.age > this.age) {
            this.lives = 0;
        }
    }

}


// StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("test")
//                .append("test");
//
//        System.out.println(stringBuffer);
//    }