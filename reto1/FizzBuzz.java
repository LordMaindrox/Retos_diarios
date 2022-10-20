public class FizzBuzz{
    public static void main(String[] args) {
        //int contador;

        for (int contador = 1; contador <= 100; contador ++){
            if (contador % 3 == 0 && contador % 5 == 0){
                System.out.println("Fizz buzz");
            }
            else if (contador % 3 == 0){
                System.out.println("Fizz");
            }
            else if (contador % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(contador);
            }
        }
    }
    
}