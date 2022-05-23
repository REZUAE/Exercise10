import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis;
        int bajt;

        try{
            fis = new FileInputStream("test123.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("File can not found");
            return;
        }
        try{
            do {
                bajt = fis.read();
                if (bajt != -1) //!= means not equal to
                    System.out.print((char) bajt);
            }
            while (bajt != -1);
        }
        catch (IOException e){
            System.out.println("Error reading the file");
        }

        finally{
            fis.close();
            System.out.println("\nclosing the file");

        }
    }
}
