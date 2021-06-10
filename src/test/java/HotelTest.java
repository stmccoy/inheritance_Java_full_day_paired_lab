import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroomOne;
    Bedroom bedroomTwo;
    ConferenceRoom conferenceRoomOne;
    ArrayList<Room> rooms;


    @Before
    public void before(){
        bedroomOne = new Bedroom(RoomType.SINGLE, 1, 20.0);
        bedroomTwo = new Bedroom(RoomType.FAMILY, 2, 20.0);
        conferenceRoomOne = new ConferenceRoom(RoomType.CONFERENCE_ROOM, "Main Conference Room");
        rooms = new ArrayList<>();
        rooms.add(bedroomOne);
        rooms.add(bedroomTwo);
        rooms.add(conferenceRoomOne);
        hotel = new Hotel(rooms);
    }

    @Test
    public void hotelHasRooms(){
        assertEquals(rooms, hotel.getRooms());
    }

    @Test
    public void canCheckGuestsIntoRoom(){
        Guest guestOne = new Guest("Ben");
        Guest guestTwo = new Guest("Bob");
        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(guestOne);
        guests.add(guestTwo);
        hotel.checkInGuest(bedroomOne, guests);
        assertEquals(guests, bedroomOne.getGuests());
    }

    @Test
    public void canCreateBooking(){
        Booking booking = hotel.bookRoom(bedroomOne, 5);
        assertEquals(bedroomOne, booking.getBedroom());
        assertEquals(5, booking.getNumberOfNightsBooked());
    }


}
