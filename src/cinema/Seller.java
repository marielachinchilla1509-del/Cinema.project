package cinema;

import java.util.Date;

public class Seller extends Employee {

    private String idSeller;
    
    private boolean state;
    
    private Date startDay;

    public Seller(String idSeller, boolean state, Date startDay) {
        this.idSeller = idSeller;
        this.state = state;
        this.startDay = startDay;
    }

  

    public Seller() {
        boolean state = false;
        String idSeller = "Not registred";
        String startDay = "Not registred";
    }

    public String getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(String idSeller) {
        this.idSeller = idSeller;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    @Override
    public String toString() {
        return "Seller{" + "idSeller=" + idSeller + ", state=" + state +
                ", startDay=" + startDay + '}';
    }
    
    

    
    }

    


