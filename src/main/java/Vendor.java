import java.util.*;

public class Vendor extends Account {
    private String brandName;
    private Map<Product,Integer> inventory;
    private Integer productQuantity;
    private Product[] showCase =new Product[5];
    private List<Order> orders;
    private Scanner scanner = new Scanner(System.in);
    private int nextIndex = 0;

    public Vendor(String firstName, String lastName, String email, String password, String brandName,
                  Map<Product, Integer> inventory, Product[] showCase, List<Order> orders) {
        super(firstName, lastName, email, password);
        this.brandName = brandName;
        this.inventory = inventory;
        this.showCase = showCase;
        this.orders = orders;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }


    public String getBrandName() {
        return brandName;
    }

    public Map<Product, Integer> getInventory() {
        return inventory;
    }

    public Product[] getShowCase() {
        return showCase;
    }

    public void addProduct(Product product, Integer productQuantity){
        inventory.put(product,productQuantity);
        System.out.println(product.toString() +" Quantity: " + productQuantity + " --- added successfully");
    }

    //product to modify -- name, category and price to update or not
    public Boolean modifyProduct(Product product){
        Integer input = 0;
        System.out.println("What would you like to modify? Type" +
                "\n1 for Name\n2 for Category\n3 for Price\n4 for Quantity\n5 for Quit");
        input = scanner.nextInt();
        while (input != 5){
            switch (input){
                case 1:
                    System.out.println("What would you like to name this product?");
                    String name = scanner.next();
                    product.setName(name);
                     if (product.getName().equals(name)){
                        System.out.println("What would you like to modify? Type" +
                                "\n1 for Name\n2 for Category\n3 for Price\n4 for Quantity\n5 for Quit");
                        input = scanner.nextInt();}
                    break;
                case 2:
                    System.out.println("What category would you like to change this product to?");
                    ProductCategory category = ProductCategory.valueOf(scanner.next());
                    product.setCategory(category);
                    System.out.println("What would you like to modify? Type" +
                            "\n1 for Name\n2 for Category\n3 for Price\n4 for Quantity\n5 for Quit");
                    input = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("What would you like to price this product?");
                    Double price = scanner.nextDouble();
                    product.setPrice(price);
                    System.out.println("What would you like to modify? Type" +
                            "\n1 for Name\n2 for Category\n3 for Price\n4 for Quantity\n5 for Quit");
                    input = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("How many of this product do you have?");
                    Integer productQuantity = scanner.nextInt();
                    inventory.put(product, productQuantity);
                    System.out.println("What would you like to modify? Type" +
                            "\n1 for Name\n2 for Category\n3 for Price\n4 for Quantity\n5 for Quit");
                    input = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("finished modifying");
                    break;
            }
        }
        System.out.println(product.toString() + " modified successfully");
        return true;
    }

    public Boolean removeProduct(Product product, Integer productQuantity){
        inventory.remove(product,productQuantity);//quantity so it doesn't delete the whole object
        System.out.println(product.toString() +"Quantity: "+ productQuantity +" --- removed successfully");
        return true;
    }

    public Boolean cancelOrder(Order order){
        return null;
    }

    public void addProductToShowcase(Map<Product, Integer> product){
        if (showCase.length <= 5){
            showCase[nextIndex] = (Product) product;
        }
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

    public static void main(String[] args) {
        String firstName = "Test";
        String lastName = "Vendor";
        String email = "test@email.com";
        String password = "password";
        String brand = "testBrand";
        Map<Product,Integer> inventory = new HashMap<>();
        Product[] showCase = new Product[5];
        List<Order> orders = new ArrayList<>();
        Vendor vendor = new Vendor(firstName,lastName,email,password,
                brand,inventory, showCase,orders);
        Product product1 = new Product("keyboard", ProductCategory.ELECTRONICS,55.00);
        Product product2 = new Product("headphones", ProductCategory.ELECTRONICS, 65.00);

        vendor.addProduct(product1,1);
        vendor.addProduct(product2, 2);
        Map<Product, Integer> actual = vendor.getInventory();
        System.out.println("Inventory: "+actual);
        vendor.modifyProduct(product1);
    }

}
