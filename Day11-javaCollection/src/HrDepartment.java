/**
 * Created by kaurk on 7/25/2017.
 */
public class HrDepartment {
    static  void changeDesignation(EmployeeService emp, String newDesignation){
        emp.setDesig(newDesignation);
        System.out.println(" New designation is : " + emp.getDesig());
    }
}
