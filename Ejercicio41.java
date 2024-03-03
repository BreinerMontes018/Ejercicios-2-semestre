import java.util.*;
public class Ejercicio41 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("**************************************************************");
        System.out.println("Conoce la medida de tu cabello si nunca te lo hubieras cortado");
        System.out.println("**************************************************************");
        System.out.println("Ingresa tu edad actual");
        int edad = entrada.nextInt();
        double tamaño = (edad*12)*0.5;
        System.out.println("Tu cabellera seria de "+tamaño+" centimetros");
    }
}
