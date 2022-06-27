import exceptions.ProductNotAvailableException;
import exceptions.ProductNotFound;
import org.hamcrest.Matcher;
import org.hamcrest.collection.IsArrayContaining;
import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;


public class VendorTest {
    private Vendor vendor;
    private Product product1;
    private Product product2;
    private Product product3;
    private Product product4;
    private Product product5;
    private Product product6;
    private Product product7;
    private Product product8;
    private Product product9;

    @BeforeEach void setUp(){
        String firstName = "Test";
        String lastName = "Vendor";
        String email = "test@email.com";
        String password = "password";
        String brand = "testBrand";
        Map<Product, Integer> inventory = new HashMap<>();
        Product[] showcase = new Product[5];
        vendor = new Vendor(firstName,lastName,email,password,
                brand);
        product1 = new Product("keyboard", ProductCategory.ELECTRONICS,55.00);
        product2 = new Product("headphones", ProductCategory.ELECTRONICS, 65.00);
        product3 = new Product("vacuum", ProductCategory.HOME_APPLIANCE,135.00);
        product4 = new Product("hoodie", ProductCategory.CLOTHING, 45.99);
        product5 = new Product("shoes", ProductCategory.CLOTHING, 265.00);
        product6 = new Product("tv", ProductCategory.ELECTRONICS, 250.00);
        product7 = new Product("mouse", ProductCategory.ELECTRONICS, 49.00);
        product8 = new Product("logitech pro mouse", ProductCategory.ELECTRONICS, 99.00);
        product9 = new Product("razor gator mouse", ProductCategory.ELECTRONICS, 199.00);


        vendor.addProduct(product1,1);
        vendor.addProduct(product2, 2);
        vendor.addProduct(product3, 2);
        vendor.addProduct(product4, 16);
        vendor.addProduct(product5, 5);
        vendor.addProduct(product6, 2);
        vendor.addProduct(product7, 3);
        vendor.addProduct(product8, 2);
        vendor.addProduct(product9, 11);
    }

    @Test void constructorTest(){
        assertNotNull(vendor);
    }

    @Test void getFirstNameTest(){
        String expected = "Test";
        String actual = vendor.getFirstName();
        assertEquals(expected,actual);
    }

    @Test void getLastNameTest(){
        String expected = "Vendor";
        String actual = vendor.getLastName();
        assertEquals(expected,actual);
    }

    @Test void getEmailTest(){
        String expected = "test@email.com";
        String actual = vendor.getEmail();
        assertEquals(expected,actual);
    }

    @Test void getBrandNameTest(){
        String expected = "testBrand";
        String actual = vendor.getBrandName();
        assertEquals(expected,actual);
    }

    @Test void getInventoryTest(){
        Map<Product, Integer> actual = vendor.getInventory();
        assertThat(actual, hasKey(product1));
         }

    @Test void getShowCaseTest(){
        Product[] expected = {null,null,null,null,null};
        Product[] actual = vendor.getShowCase();
        assertThat(actual, is(expected));
    }

    @Test void addProductTest01(){
        Map<Product, Integer> actual = vendor.getInventory();
        assertThat(actual, IsMapContaining.hasEntry(product1,1));
        //checks that the item is in the map
    }

    @Test void modifyProductTest01(){
        Product productExpected = new Product("keyboard with cat key caps",ProductCategory.ELECTRONICS,75.00);
        Map<Product, Integer> actual = vendor.getInventory();
        vendor.modifyProduct(product1,"keyboard with cat key caps",ProductCategory.ELECTRONICS,75.00,1);
        Assertions.assertEquals(productExpected.toString(), product1.toString());
    }

    @Test void removeProductTest01(){
        Map<Product, Integer> actual = vendor.getInventory();
        vendor.removeProduct(product1,1);
        assertThat(actual, not(IsMapContaining.hasKey(product1)));
        //checks the item has successfully been removed
    }

    @Test void addProductToShowcaseTest(){
        vendor.addProductToShowcase(product1);
        Product[] actual = vendor.getShowCase();
        assertThat(actual, IsArrayContaining.hasItemInArray(product1));
    }

    @Test void searchProductByCategoryTest() throws ProductNotFound {
        List<Product> products = vendor.searchByCategory(ProductCategory.ELECTRONICS);
        assertThat(products, containsInAnyOrder(product1,product2,product6,product7,product8,product9));
    }

    @Test void searchProductByNameTest() throws ProductNotFound {
        List<Product> products = vendor.searchByName("mouse");
        assertThat(products, containsInAnyOrder(product1,product2,product6,product7,product8,product9));
    }

    @Test void purchaseProductTest() throws ProductNotAvailableException {
        Address address = new Address("Lincoln Blvd","65","Dreadnought", "OH");
        Order expected = new Order(product2,address,OrderStatus.PENDING);
        Order actual = vendor.purchase(product2, address);
        assertEquals(actual.toString(), expected.toString());
        }

    @Test void cancelOrderTest() throws ProductNotAvailableException {
        Address address = new Address("Lincoln Blvd","65","Dreadnought", "OH");
        Order order = vendor.purchase(product1, address);
        Boolean actual = vendor.cancelOrder(order);
        assertTrue(actual);
    }

    @Test void displayAllOrdersTest() throws ProductNotAvailableException {
        Address address = new Address("Lincoln Blvd","65","Dreadnought", "OH");
        vendor.purchase(product2, address);
        String orderS = vendor.displayAllOrders();
        assertNotNull(orderS);
    }



}