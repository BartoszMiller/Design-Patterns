package structural.decorator;

public abstract class CarDecorator implements Car {

    private final Car decoratedCar;

    public CarDecorator(Car decoratedCar){
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void drive() {
        decoratedCar.drive();
    }
}
