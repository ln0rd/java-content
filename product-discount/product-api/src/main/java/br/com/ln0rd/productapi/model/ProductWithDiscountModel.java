package br.com.ln0rd.productapi.model;

public class ProductWithDiscountModel {

    private int priceInCents;
    private String title;
    private String description;
    private DiscountModel discountModel;

    public ProductWithDiscountModel(int priceInCents, String title, String description, DiscountModel discountModel) {
        this.priceInCents = priceInCents;
        this.title = title;
        this.description = description;
        this.discountModel = discountModel;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void getPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DiscountModel getDiscount() {
        return discountModel;
    }

    public void setDiscount(DiscountModel discountModel) {
        this.discountModel = discountModel;
    }

    @Override
    public String toString() {
        return "ProductWithDiscount{" +
                "  priceInCents=" + priceInCents +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", discount=" + discountModel +
                '}';
    }
}
