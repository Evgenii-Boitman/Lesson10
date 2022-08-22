package HomeWork10;

import java.util.Objects;

public class Renault extends Car {
    public int renaultCar;

    public Renault(String name, String model, int year, double maxSpeed, double power, String number) {
        super(name, model, year, maxSpeed, power, number);
        this.renaultCar = renaultCar;
    }

    public int getRenaultCar() {
        return renaultCar;
    }

    public void setRenaultCar(int renaultCar) {
        this.renaultCar = renaultCar;
    }

    @Override
    public String toString() {
        return "Renault{" +
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
        Renault renault = (Renault) o;
        return renaultCar == renault.renaultCar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), renaultCar);
    }
}
