import javax.xml.stream.Location;

/**
 * Created by kaurk on 7/22/2017.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String deptName;
    private int employeeId;
    private Enum location;

    public Employee(String firstName, String lastName, String deptName, int employeeId, Enum location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptName = deptName;
        this.employeeId = employeeId;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", deptName='" + deptName + '\'' +
                ", employeeId=" + employeeId +
                ", location=" + location +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Enum getLocation() {
        return location;
    }

    public void setLocation(Enum location) {
        this.location = location;
    }
}
