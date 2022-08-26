public class OldComputers implements Locatable,Priceable{

    String description;
    double price;

    public OldComputers(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getTax() {
        return 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void getDepot() {
        System.out.println(getDescription() + " in the store.");

    }

    @Override
    public void getPlace() {
        System.out.println(getDescription() + " was placed in the store.");

    }

    @Override
    public void purchase() {
        System.out.println(getDescription() + " were sold. ");

    }
}
