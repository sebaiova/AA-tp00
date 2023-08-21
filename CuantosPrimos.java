import java.util.Scanner;

public class CuantosPrimos {
    
    static private boolean esPrimo(int n)
    {   
        if(n<2)
            return false;

        int nsqrt = (int)Math.floor(Math.sqrt(n));
        for(int i=nsqrt; i>1; i--)
            if(n%i == 0)
                return false;
                
        return true;
    }

    static private int contarPrimosHasta(int n)
    {
        int count = 0;
        for(int i=1; i<=n; i++)
            if(esPrimo(i)) {
                count++;
            }
        return count;
    }

    static public void main(String[] args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        n = scanner.nextInt();        

        System.out.printf("Existen %d numeros primos entre 1 y %d.\n", contarPrimosHasta(n), n);

        scanner.close();
    }
}
