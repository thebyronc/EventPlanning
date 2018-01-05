import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import models.Event;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the Event Planning. Would you like to create a new event?");
        System.out.println("Yes, No");
        try {
            String userInput = bufferedReader.readLine();
            String returnedInput = Event.checkUserResponse(userInput);
            if(returnedInput.equals("yes")) {
                System.out.println("What is the name of your Event?");
                String eventName = bufferedReader.readLine();
                System.out.println("How many guests will be attending your Event?");
                int numberOfGuest = Integer.parseInt(bufferedReader.readLine());
                System.out.println("What main dish would you like to serve? If you prefer not to serve a main dish enter 'no'.");
                String food = bufferedReader.readLine();
                System.out.println("What drink would you like to serve to your guests? If you prefer not to serve drinks enter 'no'.");
                String drinks = bufferedReader.readLine();
                System.out.println("What type of entertainment would you like to have at the event? If you prefer not to have entertainment enter 'no'.");
                String entertainment = bufferedReader.readLine();
                Event event = new Event();
                event.name = eventName;
                event.guests = numberOfGuest;
                event.food = food;
                event.drinks = drinks;
                event.entertainment = entertainment;
                System.out.println("Your event " + Event.getEventName(event) + " will cost a total of: $" + Event.calculateCost(event));


            } else if (returnedInput.equals("no")){
                System.out.println("It's ok, I don't like gatherings anyways.");
            } else {
                System.out.println(returnedInput);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
