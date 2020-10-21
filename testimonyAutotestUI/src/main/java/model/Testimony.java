package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Testimony {
    private LocalDate localDate;
    private BigDecimal coldData;
    private BigDecimal hotData;
    private BigDecimal gasData;
    private BigDecimal elecData;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public BigDecimal getColdData() {
        return coldData;
    }

    public void setColdData(BigDecimal coldData) {
        this.coldData = coldData;
    }

    public BigDecimal getHotData() {
        return hotData;
    }

    public void setHotData(BigDecimal hotData) {
        this.hotData = hotData;
    }

    public BigDecimal getGasData() {
        return gasData;
    }

    public void setGasData(BigDecimal gasData) {
        this.gasData = gasData;
    }

    public BigDecimal getElecData() {
        return elecData;
    }

    public void setElecData(BigDecimal elecData) {
        this.elecData = elecData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Testimony testimony = (Testimony) o;
        return Objects.equals(localDate, testimony.localDate) &&
                Objects.equals(coldData, testimony.coldData) &&
                Objects.equals(hotData, testimony.hotData) &&
                Objects.equals(gasData, testimony.gasData) &&
                Objects.equals(elecData, testimony.elecData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localDate, coldData, hotData, gasData, elecData);
    }

    @Override
    public String toString() {
        return "Testimony{" +
                "localDate=" + localDate +
                ", coldData=" + coldData +
                ", hotData=" + hotData +
                ", gasData=" + gasData +
                ", elecData=" + elecData +
                '}';
    }
}
