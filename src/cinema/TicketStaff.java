package cinema;

import java.util.Date;

public class TicketStaff extends Employee {

    private String staffId;
    
    public TicketStaff(double salary, String address, String email,
                       String employeeId, String name, String position,
                       String telephone, Date startDay,
                       String staffId) {
        super(salary, address, email, employeeId, name, position, telephone, 
                startDay);
        this.staffId = staffId;
    }

    public TicketStaff() {
        super();
        this.staffId = "Not registered";
    }

   
    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return super.toString() + ", staffId='" + staffId + "'";
    }
}

