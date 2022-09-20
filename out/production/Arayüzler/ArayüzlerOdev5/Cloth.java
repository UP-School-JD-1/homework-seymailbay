public class Cloth extends Product implements Priceable,Locatable{
    String sex;
    String size;

    public Cloth(double price, double tax, String sku, String description, String sex, String size) {
        super(price, tax, sku, description);
        this.sex = sex;
        this.size = size;
    }

    @Override
    public void getDepot() {
        System.out.println(super.getDescription() + " is in the store. ");
    }

    @Override
    public void getPlace() {
        System.out.println(super.getDescription() + " was placed in the store.");
    }


    @Override
    public void purchase() {
        System.out.println("The client purchased the " + super.getDescription()  );

    }
}
