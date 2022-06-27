import java.util.List;

public class NyamazonSystem {
    private List<Customer> customers;
    private List<Vendor> vendors;

    public NyamazonSystem(List<Customer> customers, List<Vendor> vendors) {
        this.customers = customers;
        this.vendors = vendors;
    }
}
