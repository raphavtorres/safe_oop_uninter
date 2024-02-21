public class Real extends Coin {

    @Override
    public String info() {
        return "Real";
    }

    @Override
    public double convert(double coinAmount) {
        return coinAmount;
    }
}
