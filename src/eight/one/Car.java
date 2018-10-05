package eight.one;

public class Car extends Vehicle {
    private boolean ac;

    public Car(String name, double capacity, double fuelConsumption, boolean ac) {
        super(name, capacity, fuelConsumption);
        this.ac = ac;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    double realFuelConsumpiton() {
        if (isAc()) {
            return getFuelConsumption() + getFuelConsumption() * 0.8;
        } else {
            return getFuelConsumption();
        }
    }
}
