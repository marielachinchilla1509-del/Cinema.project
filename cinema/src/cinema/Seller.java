package cinema;

public class Seller extends Employee {

    private boolean state;
    private String idSeller;
    private String startDay;

    public Seller(boolean state, String idSeller, String startDay) {
        this.state = state;
        this.idSeller = idSeller;
        this.startDay = startDay;
    }

    public Seller() {
        boolean state = false;
        String idSeller = "Not registred";
        String startDay = "Not registred";
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(String idSeller) {
        this.idSeller = idSeller;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    @Override
    public String toString() {
        return "Seller{" + "state=" + state + ", idSeller=" + idSeller
                + ", startDay=" + startDay + '}';
    }

}
