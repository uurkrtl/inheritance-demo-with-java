package net.ugurkartal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Porsche", "Panamara", 2024);
        vehicle.givenInfo();

        Vehicle car = new Car("VW", "Golf", 2014, 4);
        car.givenInfo();
    }
}