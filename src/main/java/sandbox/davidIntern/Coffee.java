package sandbox.davidIntern;

public class Coffee {
    private String type;

    public Coffee(){
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
