/**
 * Created by kaurk on 7/22/2017.
 */import java.lang.String;
public class Stringpool {

    public static void main(String[] args) {

        String name = new String("cdk");
        String name1 = name.intern(); //copy of object name to pool
        String name2 = "cdk";
        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name1 == name2);
    }
}
