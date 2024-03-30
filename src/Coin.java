public abstract class Coin {

    protected double value;

    public Coin(double value) {
        this.value = value;
    }

    public abstract String info(); // return: "name - value"

    public abstract double convert();

    public double getValue() {
        return value;
    }
}
