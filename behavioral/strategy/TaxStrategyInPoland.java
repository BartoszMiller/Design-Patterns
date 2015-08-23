package behavioral.strategy;

public class TaxStrategyInPoland implements TaxStrategy {

    @Override
    public double calculateNetIncomeFor(double gross) {
        return gross * 0.8;
    }
}
