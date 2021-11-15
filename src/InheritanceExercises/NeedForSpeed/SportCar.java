package InheritanceExercises.NeedForSpeed;

public class SportCar extends Car{
    private static final double DEFAULT_FUEL_CONSUMPTION = 10; //приема нова консумация
    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);//сетва се новата консумация от с стойност 10
    }
}
