import java.io.*;

public class Task2 {
    public static void main(String[] args) {

        int bajt;

        try(FileInputStream fis = new FileInputStream("test123.txt"))
        {
            do{
                bajt= fis.read();
                if (bajt != -1)
                    System.out.println();
            }
            while(bajt != -1);
        }
        catch (FileNotFoundException e) {
            System.out.println("The file is not found");
            return;
        }
        catch(IOException e){
            System.out.println("Error reading the file");

        }
    }
}
