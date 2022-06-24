package UnitTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sandbox.davidIntern.Coffee;
import sandbox.davidIntern.David;

public class DavidTest {
    @Test
    @DisplayName("No parameter constructor")
    public void  constructorTest01(){
        //given
        David david = new David();
        String expected = "Dav";
        //when
        String actual = david.getNickName();
        //then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Parameterized constructor")
    public void  constructorTest02(){
        David david = new David("D Money");
        String expected = "D Money";
        String actual = david.getNickName();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Go on coffee run")
    public void goOnCoffeeRunTest01(){
        David david = new David();
        Double cash = 10.00;

        Coffee expected = new Coffee();

        Coffee actual = david.goOnCoffeeRun(cash);

        Assertions.assertEquals(expected.toString(), actual.toString());
    }
}
