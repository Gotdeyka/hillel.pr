package lesson_12;

import java.io.*;

public class Main {

    final static String FILE_CAT = "cat.dat";
    final static String FILE_DOG = "dog.dat";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat();
        cat.name = "Cat1";
        cat.age = 20;

        Dog dog = new Dog("dog", 25, 20);
        dog.name = "Dog1";
        dog.age = 21;
       // Passport passport = new Passport();
        writeCat(cat);
        System.out.println(readCat());

        writeDog(dog);
        System.out.println(readDog());
        cat.passport = new Passport();


    }

    private static void writeCat(Cat cat) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(FILE_CAT);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(cat);
        outputStream.close();
        objectOutputStream.close();
    }

    private static Cat readCat() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(FILE_CAT);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Object object = objectInputStream.readObject();
        inputStream.close();
        objectInputStream.close();
        return (Cat) object;
    }


    private static void writeDog(Dog dog) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(FILE_DOG);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(dog);
        outputStream.close();
        objectOutputStream.close();
    }

    private static Dog readDog() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(FILE_DOG);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Object object = objectInputStream.readObject();
        inputStream.close();
        objectInputStream.close();
        return (Dog) object;
    }


}