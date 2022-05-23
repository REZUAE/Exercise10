import java.io.*;

public class Task4 {
    public static void main(String[] args) throws IOException{
        DataManagement obj = new DataManagement();
        obj.readData();
        obj.writeDataToFile();
        obj.readDataFromFile();
    }
}
class DataManagement {
    private static String fullName;

    static void readData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your Full name : ");
        fullName = br.readLine();
    }

    static void writeDataToFile() throws IOException {
        try (FileWriter fw = new FileWriter("name04.txt"))
        {
            fw.write(fullName);

        }
        catch(FileNotFoundException e){
            System.out.println("File is not found");
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }

    static void readDataFromFile() {
        String line;
        try (BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)))
        {

            System.out.println("Saves data to the file");
            while((line = br1.readLine()) != null){
                System.out.println(line);

            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }
}
