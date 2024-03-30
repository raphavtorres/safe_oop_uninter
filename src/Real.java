import java.text.DecimalFormat;

public class Real extends Coin {

    public Real(double value) {
        super(value);
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
