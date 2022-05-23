import java.io.*;

public class Task3
{
    public static void main(String[] args) throws IOException  {

        int bajt;

        try(FileInputStream fis = new FileInputStream("show123.txt");
            FileOutputStream fos = new FileOutputStream("copyFile.txt"))
        {
            do {
                bajt = fis.read();
                if ((char) bajt == ' ') bajt = '-'; //replace space with - (dash)
                if (bajt != -1) fos.write(bajt);
            }
            while (bajt != -1);
            System.out.println("Copied successfully");
        }
        catch (FileNotFoundException e){
            System.out.println("The file is not found");
        }
        catch (IOException e){
            System.out.println("Error");
        }


    }
}
