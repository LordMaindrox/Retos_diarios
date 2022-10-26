import java.util.Scanner;
public class Esprimo{

    public static void main(String[] args){
        Integer numberToEvaluate;
        boolean control = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("write a number, Is this a prime number?: ");
        numberToEvaluate = scan.nextInt();

        if (numberToEvaluate == 0 || numberToEvaluate == 1){
            System.out.println("Is no a prime");
        }else if (numberToEvaluate == 2){
            System.out.print("Is a prime");
        }
        else{for (int i = 2; i < numberToEvaluate; i++) {
                if (numberToEvaluate % i == 0){
                    control = true;
                    }
                }
            if (control == false){
                System.out.println("Is prime");
            }else{
                System.out.println("Is not a prime");
            }
        }

    }
}