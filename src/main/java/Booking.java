public class Booking {

    private int numberOfNightsBooked;
    private Bedroom bedroom;

    public Booking(Bedroom bedroom, int numberOfNightsBooked){
        this.bedroom = bedroom;
        this.numberOfNightsBooked = numberOfNightsBooked;

    }

    public int getNumberOfNightsBooked() {
        return this.numberOfNightsBooked;
    }

    public void setNumberOfNightsBooked(int numberOfNightsBooked) {
        this.numberOfNightsBooked = numberOfNightsBooked;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public void setRoom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public double getBookingTotal(){
        return this.getBedroom().getNightlyRate() * this.getNumberOfNightsBooked();
    }
}
