package WzorProject;

public class USATax implements TaxStrategy {
    @Override
    public float calculate(float f) {
        return f*0.2f;
    }
}
