package WzorProject;

public class StrategyMain {

    public static void main(String[] args) {

        float income = 1000;
        float usTax = TaxManager.calulateTax(CountryCode.US,income);
        float plTax = TaxManager.calulateTax(CountryCode.PL, income);

        System.out.println("Income: "+income+"PL: "+plTax+" USA: "+usTax);

        System.out.println("PL: "+ TaxCalculator.PL.calculate(income));

    }

    private float calculate(TaxCalculator taxCalculator, float income){
        return taxCalculator.calculate(income);
    }
}
