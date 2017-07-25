

/**
 * Created by kaurk on 7/17/2017.
 */
public class PrimeNo {
    public void isPrime(int number){
        int i,flag=0;
        int m = number/2;
        for(i = 2; i <=m; i++){
            if(number % i == 0) {
                System.out.println("not prime");
                flag = 1;
                break;

            }
        }
        if(flag == 0){
            System.out.println("no. is prime");
        }
    }

    public static void main(String[] args) {
        PrimeNo prime = new PrimeNo();
        prime.isPrime(35);
    }
}
