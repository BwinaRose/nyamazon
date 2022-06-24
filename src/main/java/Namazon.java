import java.util.List;

public class Namazon {
    private List<Customer> customers;
    private List<Vendor> vendors;

    public Namazon() {}

    public Namazon(List<Customer> customers, List<Vendor> vendors) {
        this.customers = customers;
        this.vendors = vendors;
    }

    public void signIn(String email,String password){

    }

    public void signUpAsVendor(String firstName, String lastName, String email, String password){

    }

    public void signUpAsCustomer(String firstName, String lastName, String email, String password){

    }

    public void selectVendor(Vendor vendor){

    }


}
