package lesson3.dz;

import java.util.Objects;

public class Doggy {
    public static void main(String[] args) {
    Dog dog = new Dog("Charlie",2);


        System.out.println(dog.getAge());
        System.out.println(dog.getName());
    }

    static class Dog {

        public int age;
        public String name;

        public Dog(String name) {
            this.name = name;
        }

        public Dog(String name, int age) {
            this(name);
            if (age <= 0) throw new IllegalArgumentException("Age must be more than zero");
            else this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Dog dog = (Dog) object;
            return age == dog.age &&
                    Objects.equals(name, dog.name);
        }
        @Override
    public String toString() {
        return "Dog {\n" +
                "\tname: '" + name + "',\n" +
                "\tage: " + age +
                "\n}";
    }
    }
}
