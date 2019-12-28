package lesson_9;

class Printer extends Thread {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread.sleep(500);
            System.out.println("Tik");
        }


    }
}