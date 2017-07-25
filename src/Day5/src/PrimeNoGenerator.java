import java.util.ArrayList;

/**
 * Created by kaurk on 7/17/2017.
 */
public class PrimeNoGenerator {
    public static void main(String[] args) {
        int max = 15;
        System.out.println("list of prime number is between 1 and " + max);
        ArrayList list = getArrayList(max);
        for(int i =0;i<list.size();i++){
            System.out.println("index="+i+" "+list.get(i));
        }
    }

    static ArrayList getArrayList(int max) {
        ArrayList list = new ArrayList();

        for(int i = 2; i <= max ;i++){
            boolean isPrimeNumber = true;
            for(int j = 2 ; j < i ; j++){
                if(i % j == 0){
                    isPrimeNumber = false;
                    break;
                }
            }
            if(isPrimeNumber){
                list.add(i);
            }
        }
        return list;
    }
}
