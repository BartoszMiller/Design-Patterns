package structural.decorator;

public class Main {

    public static void main(String[] args) {

        /**
         *                          DECORATOR
         *      Car is a common type for both components and decorators.
         *      SedanCar is a concrete implementation of a component (cannot be used as a decorator)
         *
         *      CarDecorator is an abstract common type for all decorators.
         *      TurboEngineCarDecorator is a concrete implementation of a decorator.
         */

        Car sedanCar = new SedanCar();
        sedanCar.drive();

        System.out.println("****************************************");

        Car sedanCarDecoratedWithTurboEngine = new TurboEngineCarDecorator(sedanCar);
        sedanCarDecoratedWithTurboEngine.drive();
    }

}
