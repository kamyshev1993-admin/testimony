package model;

public class SendPageData {
    private String date;
    private String resultValue;
    private String coldWater;
    private String electric;
    private String gas;
    private String hotWater;

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setResultValue(String resultValue) {
        this.resultValue = resultValue;
    }

    public String getResultValue() {
        return resultValue;
    }

    public void setColdWater(String coldWater) {
        this.coldWater = coldWater;
    }

    public String getColdWater() {
        return coldWater;
    }

    public void setElectric(String electric) {
        this.electric = electric;
    }

    public String getElectric() {
        return electric;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getGas() {
        return gas;
    }

    public void setHotWater(String hotWater) {
        this.hotWater = hotWater;
    }

    public String getHotWater() {
        return hotWater;
    }

    @Override
    public String toString() {
        return
                "SendPageData{" +
                        "date = '" + date + '\'' +
                        ",resultValue = '" + resultValue + '\'' +
                        ",coldWater = '" + coldWater + '\'' +
                        ",electric = '" + electric + '\'' +
                        ",gas = '" + gas + '\'' +
                        ",hotWater = '" + hotWater + '\'' +
                        "}";
    }
}
