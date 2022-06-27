import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

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
        System.out.println("\n Welcome to Nyamazon\n    |\\__/,|   (`\\\n" +
                "  _.|o o  |_   ) )\n" +
                "-(((---(((--------\n\n  Type:\n0 To Sign In\n" +
                "1 To Sign Up as Vendor\n2 To Sign Up as Customer\n3 Exit");
        input = Integer.parseInt(scanner.nextLine());
        switch(input) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public void signIn(String email,String password){
        System.out.println("Enter e-mail");
        String regexPat = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        email = scanner.nextLine();
        if (email.matches(regexPat)){

        }

    }

    public void signUpAsVendor(String firstName, String lastName, String email, String password){

    }

    public void signUpAsCustomer(String firstName, String lastName, String email, String password){

    }

    public void selectVendor(Vendor vendor){

    }

    public static void main(String[] args) {
        Nyamazon nya = new Nyamazon();
        nya.startMenu();
    }


}
