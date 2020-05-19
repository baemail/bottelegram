import org.json.JSONObject;

import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Currency {
    public static String getcurrency (String message, Model model) throws IOException {
        URL url = new URL("https://prime.exchangerate-api.com/v5/58393aae3c249a7880ee857c/latest/kzt");

        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while (in.hasNext()){
            result += in.nextLine();
        }
        try {
            JSONObject object = new JSONObject(result);
            model.setBase(object.getString("base"));

            JSONObject conversion_rate = object.getJSONObject("conversion_rates");
            model.setEur(conversion_rate.getDouble("EUR"));
            model.setRub(conversion_rate.getDouble("RUB"));
            model.setUsd(conversion_rate.getDouble("USD"));

            
        } catch (Exception e){

        }
        return "1 тенге равен: " + model.getBase() + "\n" +
                  model.getEur() + " €" + "\n" +
                  model.getRub() + " ₽" + "\n" +
                  model.getUsd() + " $";

    }
}