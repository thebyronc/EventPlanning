import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String userInput = bufferedReader.readLine();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
