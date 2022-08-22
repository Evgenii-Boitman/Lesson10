package HomeWork10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();
        Car Renault = new Renault("Renault", "Scenic", 2002, 180, 102, "2858 EE-3");
        Car Audi = new Audi("Audi", "100", 2005, 180, 102, "3005 EO-3");
        Car BMW = new Bmw("BMW", "525", 2008, 210, 142, "1054 ET-3");
        Car Geely = new Geely("Geely", "Tugella", 2022, 250, 238, "1000 OO-3");
        garage.parking(Renault, 2);
        garage.parking(Geely, 1);
        garage.parking(Audi, 2);
        garage.parking(BMW, 3);
        garage.checkOut(Audi, 1);
        garage.amount("Audi");

        System.out.println("\n" + garage);
    }
}
