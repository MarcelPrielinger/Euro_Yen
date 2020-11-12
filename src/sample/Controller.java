package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Currency;

public class Controller {

    @FXML private Button btn_convert;
    @FXML private TextField txt_euro;
    @FXML private TextField txt_yen;

    CurrencyConverte cC = new CurrencyConverte();

    @FXML public void doConvertion()
    {
        txt_yen.setText(String.valueOf(cC.euroToYen(Double.valueOf(txt_euro.getText()))));
    }
}
