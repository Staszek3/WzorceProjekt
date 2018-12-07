package WzorProject;

public enum TaxCalculator {
    PL(0.19f), US(0.20f);
    private float percent;

    TaxCalculator(float percent) {
        this.percent = percent;
    }

    float calculate(float income){
        return income*percent;
    }
}
