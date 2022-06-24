package sandbox.practiceweb;

public class StartHi {
    public static boolean startHi(String str){
        return (str.charAt(0)=='h' && str.charAt(1)=='i');
    }

    public static void main(String[] args) {
        System.out.println(startHi("h hello"));
    }
}
