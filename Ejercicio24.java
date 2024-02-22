import java.util.*;
public class Ejercicio24 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("Ingrese las pulgadas que desea conocer");
        int pulgadas = entrada.nextInt();
        double conversion = pulgadas*2.54;
        System.out.println("Las cantidad de centimetros es "+conversion);
    
    }
}
