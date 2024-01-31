package net.ugurkartal;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void givenInfo() {
        System.out.printf("**Car** Manufacturer: %s, Model: %s, Year: %d, Number of doors: %d\n", super.getManufacturer(), super.getModel(), super.getYearOfManufacture(), this.numberOfDoors);
    }
}
