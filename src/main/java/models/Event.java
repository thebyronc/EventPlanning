package models;

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
        return "";
    }
    public static String getEventName(Event event) {
        return "";
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
}
