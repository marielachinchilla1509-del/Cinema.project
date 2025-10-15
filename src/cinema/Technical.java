package cinema;

import java.util.Date;

public class Technical extends Employee {

    private String idTechnical;
    
     
    public Technical(double salary, String address, String email,
                     String employeeId, String name, String position,
                     String telephone, Date startDay,
                     String idTechnical) {
        super(salary, address, email, employeeId, name, position, telephone, startDay);
        this.idTechnical = idTechnical;
    }

    
    public Technical() {
        super();
        this.idTechnical = "Not registered";
    }

    
    public String getIdTechnical() {
        return idTechnical;
    }

    public void setIdTechnical(String idTechnical) {
        this.idTechnical = idTechnical;
    }

    @Override
    public String toString() {
        return super.toString() + ", idTechnical='" + idTechnical + "'";
    }
}