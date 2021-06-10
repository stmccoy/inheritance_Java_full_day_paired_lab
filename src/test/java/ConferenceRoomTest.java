import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    
    ConferenceRoom conferenceRoom;
    
    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE_ROOM, "Big Conference Room");
        
    }
    
    @Test
    public void hasARoomType(){
        assertEquals(RoomType.CONFERENCE_ROOM, conferenceRoom.getRoomType());
    }

    @Test
    public void hasARoomName(){
        assertEquals("Big Conference Room", conferenceRoom.getRoomName());
    }



}
