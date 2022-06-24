package sandbox.davidIntern;

public class David implements Intern {

    private String nickName;

    public David(){
        this.nickName = "Dav";
    }

    public David(String nickName){
        this.nickName = nickName;
    }

    public String getNickName(){
        return nickName;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    @Override
    public Coffee goOnCoffeeRun(Double cash) {
        return new Coffee();
    }

    @Override
    public String toString() {
        return "David{" +
                "nickName='" + nickName + '\'' +
                '}';
    }
}
