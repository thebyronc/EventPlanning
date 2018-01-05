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
}