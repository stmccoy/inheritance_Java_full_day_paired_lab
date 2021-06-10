import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    ArrayList<Guest> guests;
    Guest guestOne;
    Guest guestTwo;

    @Before
    public void before(){
        guestOne = new Guest("Ben");
        guestTwo = new Guest("Bob");
        guests = new ArrayList<>();
        guests.add(guestOne);
        guests.add(guestTwo);
        diningRoom = new DiningRoom(RoomType.DINING_ROOM, guests, 30);
    }

    @Test
    public void diningRoomHasType(){
        assertEquals(RoomType.DINING_ROOM, diningRoom.getRoomType());
    }

    @Test
    public void diningRoomHasCapacity(){
        assertEquals(30, diningRoom.getCapacity());
    }

    @Test
    public void diningRoomHasGuests(){
        assertEquals(guests, diningRoom.getGuests());

    }

}
