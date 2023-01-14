public class Vehicle extends TaxableItem {
    private final double cost;
    private double markup;

    //    Your class should have a constructor that takes dealer cost, the dealer markup, and the tax rate as parameters.
    public Vehicle(double cost, double markup, double rate) {
        super(cost + markup, rate);
        this.cost = cost;
        this.markup = markup;
    }

    //    Also provide a public method changeMarkup, which changes the dealer markup to the value of its parameter.
    public void changeMarkup(double value) {
        this.markup = value;
        super.changeListPrice(cost + markup);
    }
}
