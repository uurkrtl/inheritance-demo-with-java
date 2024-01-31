package net.ugurkartal;

public class Motorcycle extends Vehicle{
    private String type;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String type) {
        super(manufacturer, model, yearOfManufacture);
        this.type = type;
    }

    public void givenType (){
        System.out.printf("**Motorcycle** Type: %s\n", this.type);
    }
}
