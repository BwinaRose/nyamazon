package xmentest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sandbox.xmen.Costume;
import sandbox.xmen.Sidekick;
import sandbox.xmen.Xmen;

public class SidekickTest {
    @Test
    @DisplayName("not null parameters")
    public void constructorTest01(){
        Costume costume = new Costume("fish","blue",
                "green", false);
        Sidekick sidekick = new Sidekick("","",
                "",costume);

        String actual = "";

        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("get parameters test")
    public void constructorTest02() {
        Costume costume = new Costume("fish", "blue",
                "green", false);
        Sidekick sidekick = new Sidekick("blank", "aguadude",
                "fish", costume);

        String expected = "blank aguadude fish "+"fish blue green "+ false;

        String hero = sidekick.getHero();
        String codeName = sidekick.getCodeName();
        String weapon = sidekick.getWeapon();

        String logo = costume.getLogo();
        String primaryColor = costume.getPrimaryColor();
        String secondaryColor = costume.getSecondaryColor();
        boolean mask = costume.isMask();


        String actual = String.format("%s %s %s %s", hero, codeName,
                weapon, String.format("%s %s %s %b", logo, primaryColor,
                        secondaryColor, mask));

        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("set parameters test")
    public void setterTest01(){
        Costume costume = new Costume("fish", "blue",
                "green", false);
        Sidekick sidekick = new Sidekick("blank","aguadude", "fish",
                costume);

        String expected = "God JC fish "+"cross red gold "+ false;

        String hero = sidekick.getHero();
        String codeName = sidekick.getCodeName();
        String weapon = sidekick.getWeapon();

        String logo = costume.getLogo();
        String primaryColor = costume.getPrimaryColor();
        String secondaryColor = costume.getSecondaryColor();
        boolean mask = costume.isMask();

        //set var
        sidekick.setHero("God");
        sidekick.setCodeName("JC");
        sidekick.setWeapon("fish");
        Costume costume1 = new Costume("cross", "red",
                "gold", false);
        sidekick.setCostume(costume1);

        //re get var
        hero = sidekick.getHero();
        codeName = sidekick.getCodeName();
        weapon = sidekick.getWeapon();
        logo = costume1.getLogo();
        primaryColor = costume1.getPrimaryColor();
        secondaryColor = costume1.getSecondaryColor();
        mask = costume1.isMask();


        String actual = String.format("%s %s %s %s", hero, codeName,
                weapon, String.format("%s %s %s %b", logo, primaryColor,
                        secondaryColor, mask));

        Assertions.assertEquals(expected, actual);
    }
}
