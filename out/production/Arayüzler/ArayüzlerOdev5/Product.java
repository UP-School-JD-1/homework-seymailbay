public class Product extends BaseProduct{


   protected double price;
   protected double tax;


    public Product(double price, double tax, String sku, String description) {
        super(sku,description); // bunlar ebeveynden geliyo diyorum
        this.price = price;
        this.tax = tax;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", tax=" + tax +
                ", description='" + description + '\'' +
                ", sku='" + sku + '\'' +
                '}';
    }
}
