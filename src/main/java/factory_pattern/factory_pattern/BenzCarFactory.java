package factory_pattern.factory_pattern;

public class BenzCarFactory extends CarFactory {
    @Override
    public Car createACar() {
        return new BenzCar();
    }
}
