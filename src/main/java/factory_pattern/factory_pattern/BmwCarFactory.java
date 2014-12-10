package factory_pattern.factory_pattern;

public class BmwCarFactory extends CarFactory {
    @Override
    public Car createACar() {
        return new BmwCar();
    }
}
