import java.util.*;

public class Food extends Product implements Priceable,Locatable{
   protected   int life;
    protected Date productionDate;


    public Food(double price, double tax, String sku, String description, int life, Date productionDate) {
        super(price, tax, sku, description);
        this.life = life;
        this.productionDate = productionDate;
    }

    @Override
    public void getDepot() {
        System.out.println(super.getDescription() + " in the store. ");

    }

    @Override
    public void getPlace() {
        System.out.println(super.getDescription() + " was placed in the store.");

    }

    @Override
    public void purchase() {
        System.out.println("Client purchased the " + super.getDescription());

    }
}

