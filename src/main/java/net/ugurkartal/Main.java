package net.ugurkartal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Porsche", "Panamara", 2024);
        vehicle.givenInfo();

        Car car = new Car("VW", "Golf", 2014, 4);
        car.givenInfo();

        Motorcycle motorcycle = new Motorcycle("BMW", "S 1000 RR", 2022, "Sportbike");
        motorcycle.givenType();
    }
}