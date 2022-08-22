package HomeWork10;

import java.util.Objects;

public class Geely extends Car {
    public int geelyCar;

    public Geely(String name, String model, int year, double maxSpeed, double power, String number) {
        super(name, model, year, maxSpeed, power, number);
        this.geelyCar = geelyCar;
    }

    public int getGeelyCar() {
        return geelyCar;
    }

    public void setGeelyCar(int geelyCar) {
        this.geelyCar = geelyCar;
    }

    @Override
    public String toString() {
        return "Geely{" +
                "name='" + getName() +
                "', model='" + getModel() +
                "', year='" + getYear() +
                "', maxSpeed='" + getMaxSpeed() +
                "', power='" + getPower() +
                "', number='" + getNumber() +
                "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Geely geely = (Geely) o;
        return geelyCar == geely.geelyCar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), geelyCar);
    }
}
