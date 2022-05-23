import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Task5 {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first three digit of your bank account ");
        String accountNumber = bf.readLine();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream())))
        {
            String line;
            System.out.println("Reading the line");
            while ((line = br.readLine()) != null) { // reading the line and displays that line on the screen
                //System.out.println(line);

                String[] words = line.split("\\t+");
                String bankNumber = words[0].trim(); //trim() helps in trimming the character in java can be use only in String
                String bankName = words[1].trim();
                if (bankNumber.equals(accountNumber)) { //compares accountNumber which user provide with the bankNumber from the file
                    System.out.println("Bank number : " + bankNumber + " \nBank name is : " + bankName);
                    break;
                }
            }
        }
        catch(IOException e){
            System.out.println("Error");
        }

    }
}
