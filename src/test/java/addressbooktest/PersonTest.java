package addressbooktest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sandbox.addressbook.Person;

public class PersonTest {
    @Test
    @DisplayName("get parameters test")
    public void constructorTest01(){
        Person owner = new Person("Sabrina",
                "Rose", 20, "srose@bwina.tech");

        String expected = "Sabrina Rose "+20+" srose@bwina.tech";
        String firstName = owner.getFirstName();
        String lastName = owner.getLastName();
        int age = owner.getAge();
        String email = owner.getEmail();

        String actual = String.format("%s %s %s %s", firstName, lastName,
                age, email);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("set parameter test")
    public void constructorTest02(){
        Person owner = new Person("Sabina",
                "Krueger", 19, "srosebwina.tech");

        String expected = "Sabrina Rose "+20+" srose@bwina.tech";

        String firstName = owner.getFirstName();
        String lastName = owner.getLastName();
        int age = owner.getAge();
        String email = owner.getEmail();

        owner.setFirstName("Sabrina");
        owner.setLastName("Rose");
        owner.setAge(20);
        owner.setEmail("srose@bwina.tech");

        firstName = owner.getFirstName();
        lastName = owner.getLastName();
        age = owner.getAge();
        email = owner.getEmail();

        String actual = String.format("%s %s %s %s", firstName, lastName,
                age, email);

        Assertions.assertEquals(expected,actual);
    }

}
