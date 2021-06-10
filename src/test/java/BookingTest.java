import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 1, 20.0);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void bookingHasRoom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void bookingHasNumberOfNightsBooked(){
        assertEquals(3, booking.getNumberOfNightsBooked());
    }

    @Test
    public void getBookingTotal(){
        assertEquals(60.0, booking.getBookingTotal(), 0.00);
    }

}
