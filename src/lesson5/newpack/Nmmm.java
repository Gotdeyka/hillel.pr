package lesson5.newpack;

import java.io.*;

public class Nmmm {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        BufferedInputStream buffer = null;
        try {
            inputStream = new FileInputStream("C:\\ggvp\\prvt.txt");
            buffer = new BufferedInputStream(inputStream);
            while(buffer.available()>0) {
                char c = (char)buffer.read();
                System.out.println("Был прочитан символ " + c);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            buffer.close();
        }

        inputStream.close();

        BufferedOutputStream outputStream;


    }


}
