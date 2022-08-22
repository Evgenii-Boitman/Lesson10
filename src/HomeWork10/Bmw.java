package HomeWork10;

import java.util.Objects;

public class Bmw extends Car {
    public int bmwCar;

    public Bmw(String name, String model, int year, double maxSpeed, double power, String number) {
        super(name, model, year, maxSpeed, power, number);
        this.bmwCar = bmwCar;
    }

    public int getBmwCar() {
        return bmwCar;
    }

    public void setBmwCar(int bmwCar) {
        this.bmwCar = bmwCar;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "name='" + getName() +
                "', model='"+getModel()+
                "', year='"+getYear()+
                "', maxSpeed='"+getMaxSpeed()+
                "', power='"+getPower()+
                "', number='"+getNumber()+
                "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bmw bmw = (Bmw) o;
        return bmwCar == bmw.bmwCar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bmwCar);
    }
}
