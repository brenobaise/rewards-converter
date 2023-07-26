public class RewardValue {

    // static and final because it won't change value within this "example"
    static final double MILES_TO_CASH_RATE = 0.00035;
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        // Storing cashValue if needed for later use
        this.cashValue = cashValue;
        // Calculates the miles for the cashValue
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    public RewardValue(int milesValue, boolean isMiles) {
        // This constructor is never used due to the questionable requirements
        // I chose not to have milesValue as int because the input parsed into the object is using: Double.parseDouble(input_value)
        if (isMiles) {
            // if parameter is parsed, store the miles
            // convert miles to cash
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATE;
        }
    }

    // Getters
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
