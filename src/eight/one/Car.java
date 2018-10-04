package eight.one;

public class Car extends Vehicle {
    boolean AcOn = true;

    public Car(String name, double capacity, double fuelConsumption, boolean acOn) {
        super(name, capacity, fuelConsumption);
        AcOn = acOn;
    }

    public boolean isAcOn() {
        return AcOn;
    }

    public void setAcOn(boolean acOn) {
        AcOn = acOn;
    }

    double realFuelConsumpiton() {
        if (AcOn == true) {
            return getFuelConsumption() * 0.8;
        } else {
            return getFuelConsumption();
        }
    }
}
