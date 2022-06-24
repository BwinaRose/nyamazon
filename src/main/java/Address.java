public class Address {
    private String street;
    private String unit;
    private String city;
    private String state;

    public Address(String street, String unit, String city, String state) {
        this.street = street;
        this.unit = unit;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public String getUnit() {
        return unit;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return street +" Unit "+ unit +" "+ city +", "+ state;
    }
}
