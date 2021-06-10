import java.util.ArrayList;

public class DiningRoom extends Room {

    private int capacity;
    ArrayList<Guest> guests;

    public DiningRoom(RoomType roomType, ArrayList<Guest> guests, int capacity){
        super(roomType);
        this.guests = guests;
        this.capacity = capacity;

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests(){
        return this.guests;
    }

}
