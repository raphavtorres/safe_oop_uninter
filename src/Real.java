public class Real extends Coin {

    public Real(double value, double value1) {
        super(value);
        this.value = value1;
    }

    @Override
    public String info() {
        return "Real - " + this.value;
    }

    @Override
    public double convert() {
        return this.value;
    }
}
