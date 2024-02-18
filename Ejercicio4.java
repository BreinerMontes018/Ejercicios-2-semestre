import java.util.*;
public class Ejercicio4 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conozca el area de un circulo");
        System.out.println("                             ");
        System.out.println("Introduzca el radio del circulo");
        double radio = entrada.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area de el circulo es "+area);

    }
    
}
