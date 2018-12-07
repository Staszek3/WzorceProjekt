package WzorProject;

public class PLTax implements TaxStrategy {
    @Override
    public float calculate(float income) {
        if (income < 82000) {
            return income * 0.18f;
        }
        return 82000f * 0.18f + (income - 82000f) * 0.32f;
    }

}
