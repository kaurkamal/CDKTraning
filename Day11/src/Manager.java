/**
 * Created by kaurk on 7/25/2017.
 */
public class Manager {
    static boolean eligibleForPromotion(EmployeeService emp, String newDesig){
        if(emp.getDesig().equalsIgnoreCase(newDesig));
        return true;

    }
    static void changeProject(EmployeeService emp, String newProject){
        emp.setProjectName(newProject);
        System.out.println("new project is : " + emp.getProjectName());
    }

}
