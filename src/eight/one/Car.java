package eight.one;

public class Car extends Vehicle {
    private boolean AC;

    public Car(String name, double capacity, double fuelConsumption, boolean AC) {
        super(name, capacity, fuelConsumption);
        this.AC = AC;
    }

    public boolean isAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    double realFuelConsumpiton() {
        if (!isAC()) {
            return getFuelConsumption() * 0.8;
        } else {
            return getFuelConsumption();
        }
    }
}
