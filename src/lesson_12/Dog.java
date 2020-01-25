package lesson_12;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Dog implements Serializable {

    public String name;
    public int age;
    public int weight;
    public Passport passport;

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
        out.writeInt(weight);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
        weight = in.readInt();
    }

    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
