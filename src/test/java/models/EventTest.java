package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void Event_checkUserResponse() {
        Event event = new Event();
        assertEquals("yes", event.checkUserResponse("yes"));
    }
    @Test
    public void Event_checkInvalidResponse() {
        Event event = new Event();
        assertEquals("Im sorry, I do not understand.", event.checkUserResponse("@5K"));
    }
    @Test
    public void Event_getEventGuestNumber() {
        Event event = new Event();
        Event test = new Event();
        test.name = "Test Event Name";
        test.guests = 3;
        test.food = "Pizza";
        test.drinks = "Coffee";
        test.entertainment = "Band";
        assertEquals(3, event.getGuests(test));
    }
    @Test
    public void Event_getFood() {
        Event event = new Event();
        Event test = new Event();
        test.name = "Test Event Name";
        test.guests = 3;
        test.food = "Pizza";
        test.drinks = "Coffee";
        test.entertainment = "Band";
        assertEquals("Pizza", event.getFood(test));
    }
    @Test
    public void Event_getDrink() {
        Event event = new Event();
        Event test = new Event();
        test.name = "Test Event Name";
        test.guests = 3;
        test.food = "Pizza";
        test.drinks = "Coffee";
        test.entertainment = "Band";
        assertEquals("Coffee", event.getDrink(test));
    }
    @Test
    public void Event_getEntertainment() {
        Event event = new Event();
        Event test = new Event();
        test.name = "Test Event Name";
        test.guests = 3;
        test.food = "Pizza";
        test.drinks = "Coffee";
        test.entertainment = "Band";
        assertEquals("Band", event.getEntertainment(test));
    }
    @Test
    public void Event_getEventName() {
        Event event = new Event();
        Event test = new Event();
        test.name = "Test Event Name";
        test.guests = 3;
        test.food = "Pizza";
        test.drinks = "Coffee";
        test.entertainment = "Band";
        assertEquals("Test Event Name", event.getEventName(test));
    }
    @Test
    public void Event_calculateCost() {
        Event event = new Event();
        Event test = new Event();
        test.name = "Test Event Name";
        test.guests = 3;
        test.food = "Pizza";
        test.drinks = "Coffee";
        test.entertainment = "Band";
        assertEquals(230, event.calculateCost(test));
    }
    @Test
    public void Event_useCoupons() {
        Event event = new Event();
        Event test = new Event();
        test.name = "Test Event Name";
        test.guests = 3;
        test.food = "Pizza";
        test.drinks = "Coffee";
        test.entertainment = "Band";
        String[] coupons = {"FreeDJ", "25Off"};
        assertEquals(5, event.useCoupons(test, coupons));
    }

}