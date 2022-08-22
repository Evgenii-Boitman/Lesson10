package HomeWork10;

import java.util.Objects;

public class Audi extends Car {
    public int audiCar;

    public Audi(String name, String model, int year, double maxSpeed, double power, String number) {
        super(name, model, year, maxSpeed, power, number);
        this.audiCar = audiCar;
    }

    public int getAudiCar() {
        return audiCar;
    }

    public void setAudiCar(int audiCar) {
        this.audiCar = audiCar;
    }

    @Override
    public String toString() {
        return "Audi{" +
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
        Audi audi = (Audi) o;
        return audiCar == audi.audiCar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), audiCar);
    }
}
