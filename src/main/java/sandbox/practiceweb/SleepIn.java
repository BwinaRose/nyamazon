package sandbox.practiceweb;

public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation){
        if (vacation || !weekday){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
    }

}


