package sandbox.att;

public class Customer {
    private Iphone phone;

    public Customer(Iphone iphone){
        this.phone = phone;
    }

    public static void main(String[] args) {
        Iphone phone1 = new Iphone();
        Android phone2 = new Android();
        Customer customer = new Customer(phone1);

    }
}
