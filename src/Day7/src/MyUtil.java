/**
 * Created by kaurk on 7/19/2017.
 */
public class MyUtil {
    /* public static int[] sort(int[] arr){
         int temp = 0;
         for(int i = 0 ; i < arr.length ; i++){
             for(int j = i+1; j<=i ; j++){
                 if(arr[i]>arr[j]){
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }
         }return arr;
     }*/
    public static Employee[] sort(Employee[] emp, Compare com) {

        Employee temp;
        for (int i = 0; i < emp.length; i++) {
            for (int j = i + 1; j < emp.length; j++) {
                if (com.isGreater(emp[i], emp[j])) {
                    temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }
            }
        }
        return emp;
    }
}