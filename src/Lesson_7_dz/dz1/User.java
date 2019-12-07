package Lesson_7_dz.dz1;

public class User {

    String name;
    int date;

    public User() {

    }

    public User(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setAge(int age) {
        this.date = date;
    }

    @Override
    public String toString() {
        return getName();
    }
}