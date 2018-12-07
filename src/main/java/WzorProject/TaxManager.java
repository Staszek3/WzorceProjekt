package WzorProject;

import java.util.HashMap;
import java.util.Map;

import static WzorProject.CountryCode.PL;
import static WzorProject.CountryCode.US;

public class TaxManager {

   private static Map<CountryCode, TaxStrategy> strategies=
           new HashMap<>();
        static {
            strategies.put(PL,new PLTax());
            strategies.put(US,new USATax());
    }
    public static TaxStrategy getStrategy(CountryCode countryCode){
//            if (countryCode==CountryCode.PL){
//                return new PLTAX();
//            }else {
//                return new USATax();
//            }
        return strategies.get(countryCode);
    }

    public static float calulateTax(CountryCode countryCode, float income){
            return getStrategy(countryCode).calculate(income);
    }
}
