package sandbox.petstore;

public class Bird extends Animal implements Flying{

    public Bird(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void fly() {}


}
