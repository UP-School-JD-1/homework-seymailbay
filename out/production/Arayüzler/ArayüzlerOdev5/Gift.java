public class Gift extends BaseProduct implements Locatable{

    public Gift(String sku, String description) {
        super(sku,description);
    }

    public void giveAGift(){
        System.out.println(super.description + " was given as a gift.");
    }
    @Override
    public void getDepot() {
        System.out.println(super.getDescription() + " is in the store.");
    }

    @Override
    public void getPlace() {

    }
}
