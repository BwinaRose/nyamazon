import java.util.Objects;

public class Order {
    private static Long idCount = 1L;
    private Long id;
    private Product product;
    private Address address;
    private OrderStatus status;

    public Order(Product product, Address address, OrderStatus status) {
        this.id = idCount++;
        this.product = product;
        this.address = address;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public Address getAddress() {
        return address;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(product, order.product) && Objects.equals(address, order.address) && status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, address, status);
    }
}
