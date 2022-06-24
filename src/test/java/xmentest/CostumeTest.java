package xmentest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sandbox.xmen.Costume;

public class CostumeTest {
    @Test
    @DisplayName("not null parameters")
    public void constructorTest01(){
        Costume costume = new Costume("","","",false);

        String actual = "";

        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("get parameters test")
    public void constructorTest02(){
        Costume costume = new Costume("fish",
                "blue", "green",
                false);

        String expected = "fish blue green "+ false;
        String logo = costume.getLogo();
        String primaryColor = costume.getPrimaryColor();
        String secondaryColor = costume.getSecondaryColor();
        boolean mask = costume.isMask();

        String actual = String.format("%s %s %s %b", logo, primaryColor,
                secondaryColor, mask);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("set parameters test")
    public void setterTest01(){
        Costume costume = new Costume("fish",
                "blue", "green",
                false);

        String expected = "cross red gold "+ false;

        //get var
        String logo = costume.getLogo();
        String primaryColor = costume.getPrimaryColor();
        String secondaryColor = costume.getSecondaryColor();
        boolean mask = costume.isMask();

        //set var
        costume.setLogo("cross");
        costume.setPrimaryColor("red");
        costume.setSecondaryColor("gold");
        costume.setMask(false);

        //re get var
        logo = costume.getLogo();
        primaryColor = costume.getPrimaryColor();
        secondaryColor = costume.getSecondaryColor();
        mask = costume.isMask();



        String actual = String.format("%s %s %s %b", logo, primaryColor,
                secondaryColor, mask);

        Assertions.assertEquals(expected,actual);
    }
}
