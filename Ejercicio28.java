import java.util.*;
public class Ejercicio28 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número para la cuenta atrás:");
        int numero = entrada.nextInt();
        
        if(numero < 0) {
            System.out.println("El número debe ser mayor o igual a 0");
        } else {
            System.out.println();
            for(int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        }
    }
}
