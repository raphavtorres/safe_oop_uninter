public class Dollar extends Coin {

    private double value;

    public Dollar(double value) {
        this.value = value;
    }

    @Override
    public String info() {
        return "Dollar";
    }

    @Override
    public double convert(double coinAmount) {
        double value = Value.DOLLAR.getValue();
        return coinAmount / value;
    }

}
