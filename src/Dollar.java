import java.text.DecimalFormat;

public class Dollar extends Coin {

    public Dollar(double value) {
        super(value);
    }

    @Override
    public String info() {
        return "Dollar - " + this.value;
    }

    @Override
    public double convert() {
        double exchangeRate = ExchangeRate.DOLLAR.getExchangeRate();
        return this.value * exchangeRate;
    }
}
