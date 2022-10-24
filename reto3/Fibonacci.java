public class Fibonacci{

    public static void main(String[] args) {
        
        int num1 = 0, num2 = 1;
        int [] Fibonacci = new int[20];
        System.out.print(num1+", "+num2+ ", ");
        for (int i = 0; i < 20; i++) {
            
            int result = num1 + num2;
            Fibonacci[i] = num1 + num2;
            num1 = num2;
            num2 = result;
            System.out.print(Fibonacci[i]+", ");
        
        
        }

    }
}