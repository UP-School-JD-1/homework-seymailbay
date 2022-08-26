public class Location implements Locatable {
    private String depot;
    private String place;

    public Location(String depot, String place) {
        this.depot = depot;
        this.place = place;
    }

    @Override
    public void getDepot() {

    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    @Override
    public void getPlace() {

    }

    public void setPlace(String place) {
        this.place = place;
    }
}