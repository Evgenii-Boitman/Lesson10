package HomeWork10;

import java.util.*;
import java.util.function.Consumer;

public class Garage {
    private Map<Car, Integer> garage = new HashMap<>();

    public  void parking( Car car, int qty) {
        if (!garage.containsKey(car)) {
            garage.put(car, qty);
        }
        else {
            garage.replace(car, garage.get(car) + qty);
        }
        System.out.println(qty + " " + car.getName() + " " + car.getModel() + " parked");
    }

    public  void checkOut(Car car, int qty) {
        if(garage.containsKey(car)){
            garage.replace(car, garage.get(car) - qty);
            System.out.println(qty + " " + car.getName() + " " + car.getModel() + " set out");
        }
        else{
            garage.replace(car,0);
        }
    }

    public  void amount( String car) {
        int amountCarInGarage = 0;
        for(Map.Entry<Car, Integer> item : garage.entrySet()) {
            if (item.getKey().getName().equals(car)) {
                amountCarInGarage += item.getValue();
            }
        }
        System.out.println("in garage " + amountCarInGarage + " " + car);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garage="+ garage +
                '}';
    }
}
