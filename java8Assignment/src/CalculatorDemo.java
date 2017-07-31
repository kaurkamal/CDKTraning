/**
 * Created by kaurk on 7/28/2017.
 */
public class CalculatorDemo {
    public static void main(String[] args){

        CalculatorService.calculateresult(10, 20,(int number1, int number2)-> {
            System.out.printf("addition result : %d%n", number1+number2);
        });

        CalculatorService.calculateresult( 16, 2,(int number1, int number2)-> {
            System.out.printf("multiplication result : %d%n", number1*number2);
        });

        CalculatorService.calculateresult(90, 40,(int number1, int number2)-> {
            System.out.printf("subtraction result : %d%n", number1-number2);
        });

    }
}
