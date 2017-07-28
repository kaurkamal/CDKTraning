import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by kaurk on 7/28/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list = createList();
        TreeSet<Employee> list2 = new TreeSet<>();
        for (Employee e : list) {
            if (e.getSalary() > 40000) {
                list2.add(e);
            }
        }
        System.out.println(list2);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("C:\\training\\assignment.txt");
            oos = new ObjectOutputStream(fos);
            for (Employee e : list2) {
                oos.writeObject(e);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("=======");
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("C:\\training\\assignment.txt");
            ois = new ObjectInputStream(fis);

            Employee e = (Employee)ois.readObject();
            while ( e != null){
                System.out.println(e);
                e =(Employee)ois.readObject();}


            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(EOFException e ) {
        }
        catch
         (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }}

    public static List<Employee> createList(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"kamal",20000));
        list.add(new Employee(102,"kanwal",40000));
        list.add(new Employee(103,"manisha",20500));
        list.add(new Employee(104,"harsh",60000));
        list.add(new Employee(105,"jassi",55000));
        list.add(new Employee(106,"raman",22000));
        list.add(new Employee(107,"alisha",75000));
        list.add(new Employee(108,"harleen",65000));
        list.add(new Employee(109,"gurleen",76000));
        list.add(new Employee(111,"suprina",45000));
        list.add(new Employee(121,"navneet",890000));
        return list;
    }

}
