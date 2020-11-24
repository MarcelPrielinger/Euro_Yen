package sample;

import java.util.ArrayList;


public class CurrencyConverte {

    public CurrencyConverte()
    {
        currencyList.add(new Currency("Yen", 124));
        currencyList.add(new Currency("Renminbi", 7.83));
        currencyList.add(new Currency("Bitcoin", 0.000062));            //stand: 24. Nov., 18:06 UTC
    }

    private ArrayList<Currency> currencyList = new ArrayList<Currency>();

    public ArrayList<Currency> getCurrencyList() {
        return currencyList;
    }

    public void addCurrency(Currency c) {
        this.currencyList.add(c);
    }

    public double euroToCurrency(String sign, double euro)
    {
        double currency = 0;
        for (Currency c: currencyList) {
            if(sign.equals(c.getSign())) {
                currency = euro * c.getValue();
            }
        }
        return currency;
    }
}
