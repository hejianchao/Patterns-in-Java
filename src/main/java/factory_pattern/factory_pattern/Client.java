package factory_pattern.factory_pattern;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new BenzCarFactory();
        Car aCar = carFactory.createACar();
        System.out.println(aCar.getCarTypeName());
    }
}
