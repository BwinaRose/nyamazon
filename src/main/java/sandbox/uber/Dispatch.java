package sandbox.uber;

public class Dispatch {
    public static void main(String[] args) {
        Rider rider = new Rider("Rae", "Turkey", "UK");
        Delivery delivery = new Delivery("mcdonalds", "123 house road");

        Driver driver = new Driver();
        driver.runTrip(rider);
    }
}
