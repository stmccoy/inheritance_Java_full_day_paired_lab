import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 5, 20.0);
    }

    @Test
    public void hasRoomType(){
            assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(5, bedroom.getRoomNumber());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.getGuests().size());
    }
}

