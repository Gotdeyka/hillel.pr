package lesson_8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("D:\\text.txt"));

            String firstString = reader.readLine();
            System.out.println(firstString);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally{
            System.out.println("Oww, it is block finally");
            if (reader != null){
                reader.close();
            }
        }
    }
}
