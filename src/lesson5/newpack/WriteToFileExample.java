package lesson5.newpack;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class WriteToFileExample
{
    public static void main(String[] args)
    {
        try {
            String content = "Данную строку запишем в файл";
            File file = new File("C:\\ggvp\\prvt.txt");

            // Если файл не существует, то создадим его
            if (!file.exists())
                file.createNewFile();

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Запись завершена");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

