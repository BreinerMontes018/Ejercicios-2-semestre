import java.util.*;
public class Ejercicio26 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la longitud del primer cateto:");
        double cateto1 = entrada.nextDouble();
        
        System.out.println("Ingrese la longitud del segundo cateto:");
        double cateto2 = entrada.nextDouble();
        
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        double cuadradoHipotenusa = Math.pow(hipotenusa, 2);
        
        System.out.println("El cuadrado de la hipotenusa es: " + cuadradoHipotenusa);

    }
}
