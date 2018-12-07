package WzorProject;

import java.util.Arrays;
import java.util.List;

public class Pizza1 implements Pizza {
    @Override
    public String getName() {
        return "Margarita";
    }

    @Override
    public List<String> getIngredients() {
        return Arrays.asList("ser","grzyby","sos grzybowy");
    }
}
