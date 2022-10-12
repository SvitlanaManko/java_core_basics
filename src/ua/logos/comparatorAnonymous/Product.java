package ua.logos.comparatorAnonymous;

public class Product {
    private String productName;
    private Integer productLength;
    private Integer productWidth;
    private Integer productWeight;

    public Product(String productName, Integer length, Integer width, Integer weight) {
        this.productName = productName;
        this.productLength = length;
        this.productWidth = width;
        this.productWeight = weight;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductLength() {
        return productLength;
    }

    public void setProductLength(int productLength) {
        this.productLength = productLength;
    }

    public Integer getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(int productWidth) {
        this.productWidth = productWidth;
    }

    public Integer getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    @Override
    public String toString() {
        return "\nProduct { " +
                "productName = '" + productName + '\'' +
                ", length = " + productLength +
                ", width = " + productWidth +
                ", weight = " + productWeight +
                "}";
    }
}
