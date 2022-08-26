public class Consultancy extends Product implements Priceable{
    String consultancySubject;


    public Consultancy(double price, double tax, String sku, String description, String consultancySubject) {
        super(price, tax, sku, description);
        this.consultancySubject = consultancySubject;
    }

    @Override
    public void purchase() {
        System.out.println(consultancySubject + "costs: " + super.getPrice());

    }
}
