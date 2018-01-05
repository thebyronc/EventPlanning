package models;

public class Event {
    public String name;
    public int guests;
    public String food;
    public String drinks;
    public String entertainment;

    public static int getGuests(Event event) {
        return 2;
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
