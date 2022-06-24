package sandbox.petstore;

public class Squirrel extends Animal implements Flying {

    public Squirrel(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void fly() {}


}
