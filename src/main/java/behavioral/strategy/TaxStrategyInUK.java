package behavioral.strategy;

public class TaxStrategyInUK implements TaxStrategy {

    @Override
    public double calculateNetIncomeFor(double gross) {
        return gross * 0.7;
    }
}
