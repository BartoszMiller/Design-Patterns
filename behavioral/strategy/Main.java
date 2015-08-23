package behavioral.strategy;

public class Main {

    public static void main(String[] args) {


        /**
         *                          STRATEGY
         * TaxCalculator is capable of calculating taxes in different countries.
         * All you have to do it is to pass an appropriate strategy as a parameter.
         * Different country = Different strategy.
         */

        // strategy 1 - tax in UK
        TaxCalculator calculatorUK = new TaxCalculator(new TaxStrategyInUK());
        double afterTaxesUK = calculatorUK.calculateNetIncomeFor(100000);
        System.out.println("In UK, your net income would be: " + afterTaxesUK);

        // strategy 1 - tax in PL
        TaxCalculator calculatorPL = new TaxCalculator(new TaxStrategyInPoland());
        double afterTaxesPoland = calculatorPL.calculateNetIncomeFor(100000);
        System.out.println("In Poland, your net income would be: " + afterTaxesPoland);
    }

}
