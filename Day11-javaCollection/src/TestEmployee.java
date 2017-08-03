import org.junit.Test;

/**
 * Created by kaurk on 7/25/2017.
 */
public class TestEmployee {
    @Test
    public void testService(){
        EmployeeService e1 = new EmployeeService(101,"kamal",40000.0,"8054781853","member technical","xyz");
        Account.updateSalary(e1, 55000.0);
        Account.calculateTDS(e1);
        boolean b1 = Manager.eligibleForPromotion(e1,"member technical");
        System.out.println(b1);
        Manager.changeProject(e1,"BankProject");
        HrDepartment.changeDesignation(e1,"senior member technical");
    }
}
