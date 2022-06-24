package practicetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sandbox.interns.CoffeeP;
import sandbox.interns.PersonP;

public class internTest {

    @Test
    @DisplayName("No parameter constructor")
    public void  constructorTest01(){
        //given
        PersonP person = new PersonP();
        String expected = "Fresh Meat";
        //when
        String actual = person.getNickName();
        //then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Parameterized constructor")
    public void  constructorTest02(){
        PersonP person = new PersonP("D Money");
        String expected = "D Money";
        String actual = person.getNickName();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Go on coffee run")
    public void goOnCoffeeRunTest01(){
        PersonP person = new PersonP();
        Double cash = 10.00;

        CoffeeP expected = new CoffeeP();

        CoffeeP actual = person.goOnCoffeeRun(cash);

        Assertions.assertEquals(expected.toString(), actual);
    }
}
