public class Product {
    private Long id;
    private String name;
    private ProductCategory category;
    private Double price;

    public Product(String name, ProductCategory category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

}
