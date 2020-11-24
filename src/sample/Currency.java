package sample;

public class Currency {

    private String sign;
    private double value;

    Currency(String sign, double value)
    {
        this.setSign(sign);
        this.setValue(value);
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double getValue() {
        return value;
    }

    public String getSign() {
        return sign;
    }
}
