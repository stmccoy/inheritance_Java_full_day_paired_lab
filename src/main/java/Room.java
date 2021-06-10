import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType){
        this.roomType = roomType;
        this.guests = new ArrayList<>();

    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public int getValueFromEnum() {
        return this.roomType.getValue();
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }
}
