package sandbox;

public class Person {
    private String firstName = "";
    private String lastName = "";

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lastName;
    }

    public String setFirstName(String firstName){
        this.firstName = firstName;
        return firstName;
    }
    public String setLastName(String lastName){
        this.lastName = lastName;
        return firstName;
    }

    public static void main(String[] args) {
        Person person = new Person("Sabrina", "Krueger");

        System.out.println("Goodbye");
    }
}