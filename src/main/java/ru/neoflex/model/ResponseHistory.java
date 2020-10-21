package ru.neoflex.model;
import ru.neoflex.model.testimony.Testimony;

public class ResponseHistory {

    private String previousDate;
    private Testimony previousTestimony;

    public void setPreviousTestimony(Testimony previousTestimony) {
        this.previousTestimony = previousTestimony;
    }

    public Testimony getPreviousTestimony() {
        return previousTestimony;
    }

    public void setPreviousDate(String previousDate) {
        this.previousDate = previousDate;
    }

    public String getPreviousDate() {
        return previousDate;
    }

    @Override
    public String toString() {
        return
                "ResponseHistory{" +
                        "previousTestimony = '" + previousTestimony + '\'' +
                        ",previousDate = '" + previousDate + '\'' +
                        "}";
    }
}
