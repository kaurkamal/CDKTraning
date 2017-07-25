import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kaurk on 7/18/2017.
 */



enum Location {
    Hyderabad,Pune;
}

public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", deptId=" + deptId +
               ", employeeName='" + employeeName + '\'' +
             //   ", dateOfBirth=" + dateOfBirth +
              //  ", dateOfJoining=" + dateOfJoining +
               // ", location=" + location +
                '}';
    }

    public Employee(int employeeId, int deptId, String employeeName, Date dateOfBirth, Date dateOfJoining, Location location) {
        this.employeeId = employeeId;
        this.deptId = deptId;
        this.employeeName = employeeName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.location = location;
    }

    public Employee(String employeeName, String lastName) {
        this.employeeName = employeeName;
        this.lastName = lastName;
    }

    int employeeId ;
    int deptId;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    String employeeName;
    String lastName;
    Date dateOfBirth;
    Date dateOfJoining;
    Location location;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }


    public int getdeptId() {
        return deptId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
