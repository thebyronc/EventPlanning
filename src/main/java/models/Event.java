package models;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Event {
    public String name;
    public int guests;
    public String food;
    public String drinks;
    public String entertainment;

    public static int getGuests(Event event) {
        int guests = event.guests;
        return guests;
    }
    public static String getFood(Event event) {
        String food = event.food;
        return food;
    }
    public static String getDrink(Event event) {
        String drink = event.drinks;
        return drink;
    }
    public static String getEntertainment(Event event) {
        String entertainment = event.entertainment;
        return entertainment;
    }
    public static String getEventName(Event event) {
        String name = event.name;
        return name;
    }
    public static int calculateCost(Event event) {
        int guests = getGuests(event);
        String food = getFood(event);
        String drinks = getDrink(event);
        String entertainment = getEntertainment(event);
        int totalCost = 0;
        int entertainmentCost = 0;
        //Food
        if (!food.equals("no")) {
            totalCost = totalCost + 8;
        }
        //Drinks
        if (!drinks.equals("no")) {
            totalCost +=2;
        }
        //Entertainment
        if (!entertainment.equals("no")) {
            entertainmentCost += 200;
        }
        return totalCost*guests + entertainmentCost;
    }
    public static String checkUserResponse(String userInput) {
        String input = userInput.toLowerCase();
        switch (input) {
            case "yes":
                return input;
            case "no":
                return input;
            default:
                return "Im sorry, I do not understand.";
        }
    }
    public static int useCoupons(Event event, String[] coupons) {

        int totalCost = calculateCost(event);
        for (int i = 0; i < coupons.length; i++){
            if(coupons[i].equals("FreeDJ")){
                totalCost -= 200;
            } else if(coupons[i].equals("25Off")) {
                totalCost -= 25;
            }
        }
        return totalCost;
    }
}
