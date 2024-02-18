import java.util.*;
public class Ejercicio14 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero de 4 digitos");
        int numero = entrada.nextInt();

        int digi1 = numero / 1000;
        int resto1 = numero % 1000;
        
        int digi2 = resto1 / 100;
        int resto2 = resto1 % 100;
        
        int digi3 = resto2 / 10;
        int digi4 = resto2 % 10;
        
        int suma = digi1 + digi2 + digi3 + digi4;
        
        System.out.println("La suma de los dígitos es: " + suma);
    }
}
