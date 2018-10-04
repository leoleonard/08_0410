package eight.one;

public class Truck extends Car {
    double weight;

    public Truck(String name, double capacity, double fuelConsumption, boolean acOn, double weight) {
        super(name, capacity, fuelConsumption, acOn);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    double realFuelConsumption() {
        if (AcOn) {
            return getFuelConsumption() * 1.6 + (weight / 100 * 0.5);

        } else {
            return getFuelConsumption() + (weight / 100 * 0.5);
        }
    }
    // ciezarowka spala dodatkowe 0.5l paliwa na kazde 100kg ladunku
}
