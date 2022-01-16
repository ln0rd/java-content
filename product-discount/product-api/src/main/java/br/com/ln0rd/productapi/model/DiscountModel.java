package br.com.ln0rd.productapi.model;

public class DiscountModel {

    private int valueInCents;
    private int percentage;

    public DiscountModel(int valueInCents, int percentage) {
        this.valueInCents = valueInCents;
        this.percentage = percentage;
    }

    public int getValueInCents() {
        return valueInCents;
    }

    public void setValueInCents(int valueInCents) {
        this.valueInCents = valueInCents;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "DiscountModel{" +
                "valueInCents=" + valueInCents +
                ", percentage=" + percentage +
                '}';
    }
}
