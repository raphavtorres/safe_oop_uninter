public class Dollar extends Coin {

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
