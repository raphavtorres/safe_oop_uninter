public enum ExchangeRate {
    // values from March 2024
    EURO(5.42),
    DOLLAR(5.02);

    private final double value;
    ExchangeRate(double value) {
        this.value = value;
    }

    public double getExchangeRate() {
        return this.value;
    }
}
