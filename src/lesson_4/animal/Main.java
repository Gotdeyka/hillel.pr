package lesson_4.animal;

public class Main {
    public static void main(String[] args){
        Cow cow = new Cow();
        System.out.println(cow.getName());

        Whale whale = new Whale();
        System.out.println(whale.getName());

        Cow whaleCow = new Whale();

        if (whaleCow instanceof Whale){
            ((Whale) whaleCow).test();
        }
    }

}
