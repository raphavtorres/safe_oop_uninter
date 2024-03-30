import java.text.DecimalFormat;

public class Euro extends Coin {

    public Euro(double value) {
        super(value);
    }

    @Override
    public String info() {
        return "Euro - " + this.value;
    }

    @Override
    public double convert() {
        double exchangeRate = ExchangeRate.EURO.getExchangeRate();
        return this.value * exchangeRate;
    }
}
