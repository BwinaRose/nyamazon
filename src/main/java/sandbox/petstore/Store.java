package sandbox.petstore;

import java.util.ArrayList;

public class Store {

    private ArrayList<Animal> animals;
    private ArrayList<Flying> flyers;

    public Store() {
        animals = new ArrayList<>();
        flyers = new ArrayList<>();
    }

    public void putInInventory(Animal animal){
        animals.add(animal);
    }

    public void feed(){
        for (int x = 0 ;x< animals.size(); x++){
            Animal animal = animals.get(x);
            System.out.println(animal.toString());
            animal.feed();
        }
    }


    public static void main(String[] args) {
        Bird bird = new Bird("Tweety", 2);
        Cat cat = new Cat("Garfield", 17);
        Dog dog = new Dog("Rocco", 4);
        Squirrel squirrel = new Squirrel("Rocky", 2);
        Store store = new Store();

        store.putInInventory(cat);
        //store.putInInventory(dog);
        //store.putInInventory(bird);
        //store.putInInventory(squirrel);


        store.feed();

    }
}
