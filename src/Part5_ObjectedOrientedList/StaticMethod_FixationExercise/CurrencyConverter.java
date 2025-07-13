package Part5_ObjectedOrientedList.StaticMethod_FixationExercise;

public class CurrencyConverter {
    public static final double dollarUSPrice = 5.56; // Dolar Price - US in Real (Brazil, 13/07/2025 -> DD-MM-YYYY,
                                                     // 12:59)
    
    public static final double IOF_TAX = 0.06; // IOF 6% (IOF - Tax on Financial Operations)

    public static double quantityInDolarWithIOF(double quantityInReal) {
        double dollars = quantityInReal / dollarUSPrice;
        return dollars * (1 + IOF_TAX); // Here is 1 + 0.06 (100% + 6% - Tax)
    }
}
