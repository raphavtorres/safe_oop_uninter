public class Euro extends Coin {

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
