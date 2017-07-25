package Day8.src;

/**
 * Created by kaurk on 7/20/2017.
 */
public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person("Ramesh","M");
        Person p2 = new Person("Ramesh","M");
        System.out.println(p1.equals(p2));
        System.out.println(p1.getName().hashCode() == p2.getName().hashCode());
    }
    }


