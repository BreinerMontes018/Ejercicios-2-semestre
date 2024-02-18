import java.util.*;
public class Ejercicio19 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el sueldo basico como empleado");
        double sueldo = entrada.nextDouble();
        System.out.println("Digite el monto ganado por horas extras");
        double extras = entrada.nextDouble();
        double total = sueldo+extras;
        double descuento = 0.2*total;
        double sueldoneto = total-descuento;
        System.out.println("Sueldo basico : "+sueldo);
        System.out.println("Descuento de 20% : "+descuento);
        System.out.println("Sueldo neto : "+sueldoneto);
    }
    
}
