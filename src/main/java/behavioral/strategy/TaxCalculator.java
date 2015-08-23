package behavioral.strategy;

public class TaxCalculator {

    private final TaxStrategy taxStrategy;

    public TaxCalculator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateNetIncomeFor(int gross) {
        return taxStrategy.calculateNetIncomeFor(gross);
    }
}
