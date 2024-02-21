public class Real extends Coin {

    private double value;

    public Real(double value) {
        this.value = value;
    }

    @Override
    public String info() {
        return "Real";
    }

    @Override
    public double convert(double coinAmount) {
        return coinAmount;
    }
}
