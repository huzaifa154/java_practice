public class Totalprice {
    public static double calculatedtotalprice(double MealPrice, double TipRate, double TaxRate) {
    double tip = TipRate*MealPrice;
    double tax = TaxRate*MealPrice;
    double total= MealPrice+tip+tax;
    return total;
    }

    public static void main(String[] args) {
        double grouptotal = calculatedtotalprice(100, .2, .13);
        System.out.println( grouptotal);
        double indivtotal=grouptotal/5;
        System.out.println( indivtotal);

    }
}
