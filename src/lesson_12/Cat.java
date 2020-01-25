package lesson_12;


import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Cat implements Serializable {

    private static final long serialVersionUID = 1L;

    public String name;
    public int age;
    public int weight;
    public Passport passport;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

}

