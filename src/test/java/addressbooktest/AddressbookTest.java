package addressbooktest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sandbox.addressbook.AddressBook;
import sandbox.addressbook.Person;

import java.util.LinkedList;
import java.util.List;

public class AddressbookTest {
    @Test
    @DisplayName("get parameters test")
    public void constructorTest01(){

        String firstName = "Sabrina";
        String lastName = "Rose";
        int age = 20;
        String email = "srose@bwina.tech";

        Person owner = new Person(firstName, lastName, age, email);
        AddressBook addressBook = new AddressBook(owner);

        String expected = "Sabrina Rose "+20+" srose@bwina.tech";

        String actual = String.valueOf(addressBook.getOwner());

        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("set parameter test")
    public void setTest(){
        String firstName = "Sabina";
        String lastName = "R";
        int age = 19;
        String email = "srosebwina.tech";

        Person owner = new Person(firstName, lastName, age, email);
        AddressBook addressBook = new AddressBook(owner);

        String expected = "Sabrina Rose "+20+" srose@bwina.tech";

        Person newOwner = new Person("Sabrina",
                "Rose",20,"srose@bwina.tech");
        addressBook.setOwner(newOwner);

        String actual = String.valueOf(addressBook.getOwner());

        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("add person test")
    public void addPersonTest(){
        List<Person> people = new LinkedList<>();
        String firstName = "Sabrina";
        String lastName = "Rose";
        int age = 19;
        String email = "srose@bwina.tech";

        Person owner = new Person(firstName, lastName, age, email);
        AddressBook addressBook = new AddressBook(owner);

        String expected = "[Luis B "+28+" lxb@gmail.com]";

        Person person1 = new Person("Luis",
                "B", 28, "lxb@gmail.com");

        addressBook.addPerson(person1);
        //System.out.println(AddressBook.getAllPeople());

        String actual = String.valueOf(AddressBook.getAllPeople());

        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("rm person test")
    public void rmPersonTest(){
        List<Person> people = new LinkedList<>();
        String firstName = "Sabrina";
        String lastName = "Rose";
        int age = 19;
        String email = "srose@bwina.tech";

        Person owner = new Person(firstName, lastName, age, email);
        AddressBook addressBook = new AddressBook(owner);

        String expected = "[]";

        Person person1 = new Person("Luis",
                "B", 28, "lxb@gmail.com");

        addressBook.addPerson(person1);
        //System.out.println(AddressBook.getAllPeople());
        addressBook.removePerson(person1);
        //System.out.println(AddressBook.getAllPeople());

        String actual = String.valueOf(AddressBook.getAllPeople());

        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("get person by email test")
    public void getPersonByEmailTest(){
        String firstName = "Sabrina";
        String lastName = "Rose";
        int age = 19;
        String email = "srose@bwina.tech";
        Person owner = new Person(firstName, lastName, age, email);
        AddressBook addressBook = new AddressBook(owner);

        String expected = "Luis B " + 28 + " lxb@gmail.com";

        Person person1 = new Person("Luis",
                "B", 28, "lxb@gmail.com");
        Person person2 = new Person("Hana",
                "K", 19, "hlove@gmail.com");
        Person person3 = new Person("Teela",
                "R", 24, "greenmummy@gmail.com");
        Person person4 = new Person("Dana",
                "S", 23, "catlover@yahoo.com");
        Person person5 = new Person("Will",
                "TBD", 22, "tbdprodigy@gmail.com");

        addressBook.addPerson(person1);
        addressBook.addPerson(person2);
        addressBook.addPerson(person3);
        addressBook.addPerson(person4);
        addressBook.addPerson(person5);

        String actual = String.valueOf(addressBook.getPersonByEmail("lxb@gmail.com"));

        Assertions.assertEquals(expected,actual);
    }
}
