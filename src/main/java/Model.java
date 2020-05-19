import java.util.Date;

public class Model {
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(Double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public Date getTime_last_update() {
        return time_last_update;
    }

    public void setTime_last_update(Date time_last_update) {
        this.time_last_update = time_last_update;
    }

    private String base;
    private Double conversion_rate;
    private Date time_last_update;

    public Double getEur() {
        return EUR;
    }

    public void setEur(Double eur) {
        this.EUR = eur;
    }

    public Double getUsd() {
        return USD;
    }

    public void setUsd(Double usd) {
        this.USD = usd;
    }

    public Double getRub() {
        return RUB;
    }

    public void setRub(Double rub) {
        this.RUB = rub;
    }

    private Double EUR;
    private Double USD;
    private Double RUB;
}