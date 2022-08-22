package HomeWork10;

import java.util.Objects;

public abstract class Car {
    private String name;
    private String model;
    private int year;
    private double maxSpeed;
    private double power;
    private String number;

    public Car(String name, String model, int year, double maxSpeed, double power, String number) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.power = power;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getPower() {
        return power;
    }

    public String getNumber() {
        return number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(car.maxSpeed, maxSpeed) == 0 && Double.compare(car.power, power) == 0 && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, year, maxSpeed, power, number);
    }
}
