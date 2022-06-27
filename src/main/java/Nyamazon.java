import java.util.List;
import java.util.Scanner;

public class Nyamazon {
    private List<Customer> customers;
    private List<Vendor> vendors;
    private Scanner scanner = new Scanner(System.in);

    public Nyamazon() {}

    public Nyamazon(List<Customer> customers, List<Vendor> vendors) {
        this.customers = customers;
        this.vendors = vendors;
    }
    public void startMenu(){
        Account account;
        Boolean signedIn;
        int input;
        System.out.println("Nyamazon the {Program}\nType:\n0 To Sign In\n" +
                "1 To Sign Up as Vendor\n2 To Sign Up as Customer\n3 Exit");
        input = Integer.parseInt(scanner.nextLine());
        switch(input) {
            case 0:

                break;
            case 1:
                break;

        }
    }

    public void signIn(String email,String password){
        System.out.println("Enter e-mail");

    }

    public void signUpAsVendor(String firstName, String lastName, String email, String password){

    }

    public void signUpAsCustomer(String firstName, String lastName, String email, String password){

    }

    public void selectVendor(Vendor vendor){

    }



}
