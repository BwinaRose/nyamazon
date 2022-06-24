package xmentest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sandbox.xmen.Xmen;

public class XmenTest {

    @Test
    @DisplayName("not null parameters")
    public void constructorTest01(){
        Xmen xmen = new Xmen("","",00.0,"");

        String actual = "";

        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("get parameters test")
    public void constructorTest02(){
        Xmen xmen = new Xmen("invisibility","Blank", 67.43,
                            "Normal");

        String expected = "invisibility Blank " + 67.43 + " Normal";
        String power = xmen.getPower();
        String codeName = xmen.getCodeName();
        Double height = xmen.getHeight();
        String mutantLevel = xmen.getMutantLevel();

        String actual = String.format("%s %s %.2f %s", power, codeName,
                                    height, mutantLevel);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("set parameters test")
    public void setterTest01(){
        Xmen xmen = new Xmen("invisibility","Blank", 67.43,
                "Normal");

        String expected = "literally god God " + 1087.45 + " God";

        //get var
        String power = xmen.getPower();
        String codeName = xmen.getCodeName();
        Double height = xmen.getHeight();
        String mutantLevel = xmen.getMutantLevel();

        //set var
        xmen.setPower("literally god");
        xmen.setCodeName("God");
        xmen.setHeight(1087.45);
        xmen.setMutantLevel("God");

        //re get var
        power = xmen.getPower();
        codeName = xmen.getCodeName();
        height = xmen.getHeight();
        mutantLevel = xmen.getMutantLevel();


        String actual = String.format("%s %s %.2f %s", power, codeName,
                height, mutantLevel);
        Assertions.assertEquals(expected,actual);
    }

}
