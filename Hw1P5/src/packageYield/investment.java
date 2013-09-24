package packageYield;

public class investment {
    double percent;
    int years;
    int initialInvestment;
    double futureValue;
    public investment(double percent, int years, int initialInvestment) {
        this.percent = percent;
        this.years = years;
        this.initialInvestment = initialInvestment;
        futureValue = 0.0;
    }
}
