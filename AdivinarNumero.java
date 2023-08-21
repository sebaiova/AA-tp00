import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    
    static public void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int r = random.nextInt(1000);
        int n = -1;
        
        while(n!=r) {
            System.out.print("Adivine el numero entre el 0 y el 1000: ");
            n = scanner.nextInt();
            if(n<r)
                System.out.printf("El numero es mayor que %d.\n", n);
            if(n>r)
                System.out.printf("El numero es menor que %d.\n", n);
        }
        
        System.out.printf("Correcto el numero es %d!\n", n);

        scanner.close();
    }
}
