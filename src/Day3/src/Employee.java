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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "Employee{" +
               // "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", dateOfBirth='" + simpleDateFormat.format(dateOfBirth) + '\'' +
              //  ", dateOfJoining='" + dateOfJoining + '\'' +
                '}';
    }

    public Employee(int employeeId, String employeeName, Date dateOfBirth, Date dateOfJoining, Location location) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.location = location;
    }

    int employeeId ;
    String employeeName;
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



}
