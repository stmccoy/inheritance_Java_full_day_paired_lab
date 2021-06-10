import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel(ArrayList<Room> rooms){
        this.rooms = rooms;
    }

    public ArrayList<Room> getRooms(){
        return this.rooms;
    }

    public void checkInGuest(Room room, ArrayList<Guest> guests){
        room.setGuests(guests);
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNightsBooked) {
        return new Booking(bedroom, numberOfNightsBooked);
    }


}
