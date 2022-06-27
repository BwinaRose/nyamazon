import exceptions.ProductNotAvailableException;

import java.util.*;

public class Vendor extends Account {
    private Scanner scanner = new Scanner(System.in);
    private String brandName;
    private Map<Product,Integer> inventory;
    private Integer productQuantity;
    private Product[] showCase;
    private static List<Order> orders;
    private int nextIndex = 0;

    public Vendor(String firstName, String lastName, String email,
                  String password, String brandName) {
        super(firstName, lastName, email, password);
        this.brandName = brandName;
        this.inventory = new HashMap<>();
        this.showCase = new Product[5];
        this.orders = new ArrayList<>();
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
    public Boolean modifyProduct(Product product, String name, ProductCategory category, Double price, Integer productQuantity){
//        Integer input = 0;
//        System.out.println("What would you like to modify? Type" +
//                "\n1 for Name\n2 for Category\n3 for Price\n4 for Quantity\n5 for Quit");
//        input = scanner.nextInt();
//        while (input != 5){
//            switch (input){
//                case 1:
//                    System.out.println("What would you like to name this product?");
//                    String name = scanner.next();
//                    product.setName(name);
//                     if (product.getName().equals(name)){
//                        System.out.println("What would you like to modify? Type" +
//                                "\n1 for Name\n2 for Category\n3 for Price\n4 for Quantity\n5 for Quit");
//                        input = scanner.nextInt();}
//                    break;
//                case 2:
//                    System.out.println("What category would you like to change this product to?");
//                    ProductCategory category = ProductCategory.valueOf(scanner.next());
//                    product.setCategory(category);
//                    System.out.println("What would you like to modify? Type" +
//                            "\n1 for Name\n2 for Category\n3 for Price\n4 for Quantity\n5 for Quit");
//                    input = scanner.nextInt();
//                    break;
//                case 3:
//                    System.out.println("What would you like to price this product?");
//                    Double price = scanner.nextDouble();
//                    product.setPrice(price);
//                    System.out.println("What would you like to modify? Type" +
//                            "\n1 for Name\n2 for Category\n3 for Price\n4 for Quantity\n5 for Quit");
//                    input = scanner.nextInt();
//                    break;
//                case 4:
//                    System.out.println("How many of this product do you have?");
//                    Integer productQuantity = scanner.nextInt();
//                    inventory.put(product, productQuantity);
//                    System.out.println("What would you like to modify? Type" +
//                            "\n1 for Name\n2 for Category\n3 for Price\n4 for Quantity\n5 for Quit");
//                    input = scanner.nextInt();
//                    break;
//                case 5:
//                    System.out.println("finished modifying");
//                    break;
//            }
//        }
        product.setName(name);
        product.setCategory(category);
        product.setPrice(price);
        inventory.put(product, productQuantity);
        System.out.println(product.toString() + " modified successfully");
        return true;
    }

    public Boolean removeProduct(Product product, Integer productQuantity){
        inventory.remove(product,productQuantity);//quantity so it doesn't delete the whole object
        System.out.println(product.toString() +"Quantity: "+ productQuantity +" --- removed successfully");
        return true;
    }

    public void addProductToShowcase(Product product){
        if (showCase.length <= 5){
            showCase[nextIndex] = product;
            nextIndex++;
        }
    }

    private Boolean productInInventory(Product product){
        return inventory.containsKey(product);
    }

//    public List<Product> searchByCategory(ProductCategory category) {
//        return null;
//    }
//
//    public List<Product> searchByName(String name) {
//        return null;
//    }

    public Order purchase(Product product, Address address) throws ProductNotAvailableException {
        if (!productInInventory(product)) throw new ProductNotAvailableException("Product not available");
        Order order = new Order(product, address, OrderStatus.PENDING);
        int productQuantity = inventory.get(product)-1;
        orders.add(order);
        if (orders.contains(order)){
            System.out.println(product + " was ordered successfully!");
            inventory.replace(product, productQuantity);
        }
        return order ;
    }

    public Boolean cancelOrder(Order order){
        if(order == null) return false;
        if(checkIfOrderHasShipped(order)) {
            System.out.println(order + " was cancelled successfully!");
            return orders.remove(order);
        }
        return false;
    }

    private Boolean checkIfOrderHasShipped(Order order){
        return orders.stream().anyMatch(placedOrder -> placedOrder.getId()
                .equals(order.getId()) &&
                placedOrder.getStatus() != OrderStatus.SHIPPED);
    }

    public String displayAllOrders(){
        return orders.toString();
    }

    public static void main(String[] args) {
        String firstName = "Test";
        String lastName = "Vendor";
        String email = "test@email.com";
        String password = "password";
        String brand = "testBrand";
        Vendor vendor = new Vendor(firstName,lastName,email,password,
                brand);
        Product product1 = new Product("keyboard", ProductCategory.ELECTRONICS,55.00);
        Product product2 = new Product("headphones", ProductCategory.ELECTRONICS, 65.00);
    }

}
