package com.codedifferently.computer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ComputerTest {

    @Test
    @DisplayName("No parameter test 00")
    public void  constructorTest00(){
        Computer computer = new Computer();

        String actualBrand = computer.getBrand();

        Assertions.assertNotNull(actualBrand);
    }

    @Test
    @DisplayName("Given Parameter test 01")
    public void  constructorTest01(){
        Computer computer = new Computer("Apple", "Macbook Pro",
                "BigSur", "16GB", 0.00);

        String expected = new Computer("Apple", "Macbook Pro",
                "BigSur", "16GB", 0.00).toString();

        String actual = new Computer("Apple", "Macbook Pro",
                "BigSur", "16GB", 0.00).toString();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Get parameters test 01")
    public void constructorTest02(){
        Computer computer = new Computer("Apple", "Macbook Pro",
                "BigSur", "16GB", 0.00);

        String expected = "Apple Macbook Pro BigSur 16GB";
        String brand = computer.getBrand();
        String model = computer.getModel();
        String os = computer.getOs();
        String memory = computer.getMemory();
        Double price = computer.getPrice();

        String actual = String.format("%s %s %s %s", brand, model, os, memory);

        Assertions.assertEquals(expected,actual);
    }





}
