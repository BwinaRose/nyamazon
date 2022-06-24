package sandbox.interns;

public class CoffeeP {
    private String type;

    public CoffeeP(){
        this.type = "black";

    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                '}';
    }
}
