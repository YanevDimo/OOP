package InheritanceExercises.NeedForSpeed;

public class RaceMotorcycle extends Motorcycle{

    private static final double DEFAULT_FUEL_CONSUMPTION = 8;//задаване на нова стойност
    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);//сетва се новата консумация  със стойност 8
    }
}
