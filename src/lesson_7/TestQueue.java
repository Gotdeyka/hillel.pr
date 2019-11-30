package lesson_7;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;


public class TestQueue {


    public TestQueue() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) throws IOException {

        Queue<Order> queue = new PriorityQueue<>();

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

while(true){

    String name = reader.readLine();
    if(name.equals("stop")){
        break;
    }
    Integer quantity = Integer.valueOf(reader.readLine());
    Double price = Double.valueOf(reader.readLine());
    Double amount = quantity * price;

     Order order = new Order("jj", 5, 0.0, 11.0, 4.0);

    System.out.println("We got the order");
    System.out.println(order);
    queue.offer(order);
    }
while(!queue.isEmpty()){
    System.out.println("process the order ");
    System.out.println(queue.poll());
}


    }

}






