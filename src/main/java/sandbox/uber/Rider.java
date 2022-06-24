package sandbox.uber;

import sandbox.davidIntern.Intern;

public class Rider implements Trip{
    private String name;
    private String pickUpLocation;
    private String destination;

    public Rider(String name, String pickupLocation, String getDestination){
        this.name = name;
        this.pickUpLocation = pickupLocation;
        this.destination = getDestination;
    }


    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public String getDestination() {
        return destination;
    }

}
