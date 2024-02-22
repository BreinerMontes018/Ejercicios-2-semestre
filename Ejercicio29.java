import java.util.*;
public class Ejercicio29 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese un número real: ");
            float numero = entrada.nextFloat();
            
            float cubo = calcularCubo(numero);
            
            System.out.println("El cubo de " + numero + " es: " + cubo);
        }
        
        public static float calcularCubo(float numero) {
            return numero * numero * numero;
        }
    }

