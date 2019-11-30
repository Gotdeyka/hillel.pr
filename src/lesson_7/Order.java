package lesson_7;

import java.util.Date;

public class Order implements Comparable<Order>{

    private static int ORDER_COUNT = 0;

    Integer number;
    String name;
    Integer quantity;
    Double price;
    Double amount;
    Double discount;
    Date date;


    private Order() {

    }

    public Order(String name, Integer quantity, Double price, Double amount, Double discount) {
        ORDER_COUNT++;
        this.number = ORDER_COUNT;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
        this.discount = discount;
        this.date = new Date();
    }


    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Integer getQuality() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getDiscount() {
        return discount;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public int compareTo(Order o) {

        if (this.date.getTime() < o.date.getTime()) {
            return -1;
        } else if (this.date.getTime() > o.date.getTime()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return String.format("name: %s, number: %d, date: %s, amount: %f ",
                this.getName(), this.getNumber(), this.getDate(), this.getAmount());
    }
    }

