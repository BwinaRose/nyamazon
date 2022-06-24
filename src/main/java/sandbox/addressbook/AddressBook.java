package sandbox.addressbook;
import java.util.ArrayList;
import java.util.List;

public class AddressBook{
    private Person owner;
    private Person person;
    private static ArrayList<Person> people = new ArrayList<>();

    public AddressBook(Person owner){
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void addPerson(Person person){
        this.person = person;
        people.add(person);
    }

    public void removePerson(Person person){
        this.person = person;
        people.remove(person);
    }

    public Person getPersonByEmail(String email) {
        for (Person p : people) {
            if (p.getEmail().contains(email)) {
                return p;
            }
        }
        return null;
    }

    public static List<Person> getAllPeople(){
        return people;
    }
}
