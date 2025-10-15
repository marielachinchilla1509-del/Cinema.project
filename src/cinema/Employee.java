package cinema;

import java.util.Date;

public class Employee extends Person {

    private double salary;

    private String address;

    private String email;

    private String employeeId;

    private String name;

    private String position;

    private String telephone;

    private Date startDay;

 
    public Employee(double salary, String address, String email,
                    String employeeId, String name, String position,
                    String telephone, Date startDay) {
        this.salary = salary;
        this.address = address;
        this.email = email;
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.telephone = telephone;
        this.startDay = startDay;
    }

    
    public Employee() {
        this.salary = 0;
        this.address = "Not registered";
        this.email = "Not registered";
        this.employeeId = "Not registered";
        this.name = "Not registered";
        this.position = "Not registered";
        this.telephone = "Not registered";
        this.startDay = new Date(); 
    }

    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + ", address=" + address
                + ", email=" + email + ", employeeId=" + employeeId +
                ", name=" + name + ", position=" + position + ", telephone=" 
                + telephone + ", startDay=" + startDay + '}';
    }

  
}

