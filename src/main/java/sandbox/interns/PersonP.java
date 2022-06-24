package sandbox.interns;

public class PersonP implements InternP{
    private String nickName;

    public PersonP(){
        this.nickName = "Fresh Meat";
    }

    public PersonP(String nickName){
        this.nickName = nickName;
    }

    public String getNickName(){
        return nickName;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    @Override
    public CoffeeP goOnCoffeeRun(Double cash) {
        return new CoffeeP();
    }
}
