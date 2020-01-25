package lesson_10_dz.car_filt;


public class Car {
    String type;
    int weight;

    public Car(){
    }

    public Car(String type, int weight){
        this.type = type;
        this.weight = weight;
    }

    public String getType(){
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return getType();
    }






}
