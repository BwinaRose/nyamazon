package sandbox.davidIntern;

import sandbox.davidIntern.David;

public class Sandbox {
    public static void main(String[] args) {
        David david = new David();
        David david1 = new David();
        System.out.println(david);
        System.out.println(david1);
//        System.out.println(david.toString().equals(david1.toString()));
    }
}
