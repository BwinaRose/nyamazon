import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class VendorTest {
    private Vendor vendor;
    private Product product1;
    private Product product2;

    @BeforeEach void setUp(){
        String firstName = "Test";
        String lastName = "Vendor";
        String email = "test@email.com";
        String password = "password";
        String brand = "testBrand";
        Map<Product,Integer> inventory = new HashMap<>();
        Product[] showCase = new Product[5];
        List<Order> orders = new ArrayList<>();
        vendor = new Vendor(firstName,lastName,email,password,
                brand,inventory, showCase,orders);
        product1 = new Product("keyboard", ProductCategory.ELECTRONICS,55.00);
        product2 = new Product("headphones", ProductCategory.ELECTRONICS, 65.00);
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
        Map<Product,Integer> expected = new HashMap<>();
        Map<Product, Integer> actual = vendor.getInventory();
        assertEquals(expected,actual);
    }

    @Test void getShowCaseTest(){
        Product[] expected = {null,null,null,null,null};
        Product[] actual = vendor.getShowCase();
        assertThat(actual, is(expected));
    }

    @Test void addProductTest01(){
        vendor.addProduct(product1,1);
        Map<Product, Integer> actual = vendor.getInventory();
        assertThat(actual, IsMapContaining.hasEntry(product1,1));
        //checks that the item is in the map
    }

    @Test void modifyProductTest01(){
        vendor.addProduct(product1,1);
        vendor.addProduct(product2, 2);
        Map<Product, Integer> actual = vendor.getInventory();
        System.out.println("Inventory: "+actual);
        vendor.modifyProduct(product1);
        assertThat(actual, not(IsMapContaining.hasKey(product1)));
    }

    @Test void removeProductTest01(){
        vendor.addProduct(product1,1);
        vendor.addProduct(product2, 2);
        Map<Product, Integer> actual = vendor.getInventory();
        vendor.removeProduct(product1,1);
        assertThat(actual, not(IsMapContaining.hasKey(product1)));
        //checks the item has successfully been removed
    }



}