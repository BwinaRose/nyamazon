package sandbox.interns;

import sandbox.davidIntern.Coffee;

public interface InternP {
    public default Coffee goOnCoffeeRun(){
        return null;
    }

    CoffeeP goOnCoffeeRun(Double cash);
}
