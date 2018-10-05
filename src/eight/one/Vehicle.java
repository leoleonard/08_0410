package eight.one;

public class Vehicle {
    private String name;
    private double capacity;
    private double fuelConsumption;

    public Vehicle(String name, double capacity, double fuelConsumption) {
        this.name = name;
        this.capacity = capacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    double range() {
        return capacity / realFuelConsumpiton() * 100;
    }

    double realFuelConsumpiton() {
        return getFuelConsumption();
    }
}
