public class ConferenceRoom extends Room{

    String roomName;

    public ConferenceRoom(RoomType roomType, String roomName){
        super(roomType);
        this.roomName = roomName;
    }

    public String getRoomName() {
        return this.roomName;
    }
}
