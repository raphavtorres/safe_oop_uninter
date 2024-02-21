public class Euro extends Coin {

    private double value;

    public Euro(double value) {
        this.value = value;
    }

    @Override
    public String info() {
        return "Euro - ";
    }

    @Override
    public double convert(double coinAmount) {
        double value = Value.EURO.getValue();
        return coinAmount / value;
    }
}
