abstract public class BaseProduct {
    String description;
    String sku;

    public BaseProduct( String sku, String description) {
        this.description = description;
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
