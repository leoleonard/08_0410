package eight.one;

public class Car extends Vehicle {
    boolean AcOn;

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

    double AcTurnedOn() {
        AcOn = true;
        return fuelConsumption * 0.8;
    }

}
