package InterfacesAndAbstraction.CarShop;

public class Seat implements Car {


    private final String model;
    private final String color;
    private final Integer getHorsePowe;
    private final String countryProduced;

    public Seat(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.getHorsePowe = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.getHorsePowe;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }

    @Override
    public String
    toString() {
        return "This is " + model + " produced in " + countryProduced + " and have " + Car.TIRES + " tires";
    }
}
