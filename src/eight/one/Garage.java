package eight.one;

public class Garage {
    public static void main(String[] args) {

        Car car1 = new Car("Volvo", 2000, 12.5, true);
        Car car2 = new Car("VW", 1400, 6.5, false);

        Truck truck1 = new Truck("Daff", 3500, 8, true, 3000);
        Truck truck2 = new Truck("Bytom", 2000, 9, false, 2000);

        System.out.println(car1.getName() + " has range " + car1.range() + " km");
        System.out.println(car2.getName() + " has range " + car2.range() + " km");
        System.out.println(truck1.getName() + " has range " + truck1.range() + " km");
        System.out.println(truck2.getName() + " has range " + truck2.range() + " km");


        car1.setAcOn(false);
        truck1.setAcOn(false);
        System.out.println("When AC is off " + car1.getName() + " has range " + car1.range() + " km");
        System.out.println("When AC is off " + truck1.getName() + " has range " + truck1.range() + " km");
        

    }
}
