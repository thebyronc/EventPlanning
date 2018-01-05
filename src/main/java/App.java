import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the Event Planning. Would you like to create a new event?");
        System.out.println("Yes, No");
        try {
            String userInput = bufferedReader.readLine();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
