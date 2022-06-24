import java.util.List;
import java.util.Map;

public class Vendor extends Account {
    private String brandName;
    private Map<Product,Integer> inventory;
    private Product[] showCase =new Product[5];
    private List<Order> orders;

    public Vendor(String firstName, String lastName, String email, String password, String brandName,
                  Map<Product, Integer> inventory, Product[] showCase, List<Order> orders) {
        super(firstName, lastName, email, password);
        this.brandName = brandName;
        this.inventory = inventory;
        this.showCase = showCase;
        this.orders = orders;
    }

    public void addProduct(Product product){
    }

    public Boolean modifyProduct(Product product){
        return null;
    }

    public Boolean removeProduct(Product product){
        return null;
    }

    public Boolean cancelOrder(Order order){
        return null;
    }

    public void addProductToShowcase(Map<Product, Integer> product){
    }

    public List<Product> searchByCategory(ProductCategory category) {
        return null;
    }

    public List<Product> searchByName(String name) {
        return null;
    }

    public Product purchase(Product product){
        return null;
    }

    public String displayAllOrders(){
        return null;
    }

}
