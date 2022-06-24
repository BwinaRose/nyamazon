public class Order {
    private Long id;
    private Product product;
    private Address address;
    private OrderStatus status;

    public Order(Product product, Address address, OrderStatus status) {
        this.product = product;
        this.address = address;
        this.status = status;
    }

}
