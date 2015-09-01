package structural.decorator;

public class TurboEngineCarDecorator extends CarDecorator {

    public TurboEngineCarDecorator(Car sedanCar) {
        super(sedanCar);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.print("Equipped with turbo engine!");
    }
}
