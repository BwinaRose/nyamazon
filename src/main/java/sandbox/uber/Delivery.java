package sandbox.uber;

public class Delivery implements Trip {
    private String pickUpLocation;
    private String destination;

    public Delivery(String pickUpLocation, String destination) {
        this.pickUpLocation = pickUpLocation;
        this.destination = destination;
    }

    public String getPickUpLocation(){
        return pickUpLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
