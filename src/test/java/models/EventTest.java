package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void Event_checkUserResponse() {
        Event event = new Event("Test Event Name", 3, "Pizza", "Coffee", "Band");
        assertEquals("yes", event.checkUserResponse("yes"));
    }
    @Test
    public void Event_checkInvalidResponse() {
        Event event = new Event("Test Event Name", 3, "Pizza", "Coffee", "Band");
        assertEquals("Im sorry, I do not understand.", event.checkUserResponse("@5K"));
    }
    @Test
    public void Event_getEventGuestNumber() {
        Event event = new Event("Test Event Name", 3, "Pizza", "Coffee", "Band");
        assertEquals(3, event.getGuests(event));
    }
    @Test
    public void Event_getFood() {
        Event event = new Event("Test Event Name", 3, "Pizza", "Coffee", "Band");
        assertEquals("Pizza", event.getFood(event));
    }
    @Test
    public void Event_getDrink() {
        Event event = new Event("Test Event Name", 3, "Pizza", "Coffee", "Band");
        assertEquals("Coffee", event.getDrink(event));
    }
    @Test
    public void Event_getEntertainment() {
        Event event = new Event("Test Event Name", 3, "Pizza", "Coffee", "Band");
        assertEquals("Band", event.getEntertainment(event));
    }
    @Test
    public void Event_getEventName() {
        Event event = new Event("Test Event Name", 3, "Pizza", "Coffee", "Band");
        assertEquals("Test Event Name", event.getEventName(event));
    }
    @Test
    public void Event_calculateCost() {
        Event event = new Event("Test Event Name", 3, "Pizza", "Coffee", "Band");
        assertEquals(230, event.calculateCost(event));
    }
    @Test
    public void Event_useCoupons() {
        Event event = new Event("Test Event Name", 3, "Pizza", "Coffee", "Band");
        String[] coupons = {"FreeDJ", "25Off"};
        assertEquals(5, event.useCoupons(event, coupons));
    }

}