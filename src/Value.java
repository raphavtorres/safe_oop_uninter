public enum Value {
    EURO(5.33),
    DOLLAR(4.93);

    private final double value;
    Value(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
