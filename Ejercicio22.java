import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero real");
        double numero = entrada.nextDouble();

        int ParteEnt = (int)numero;
        double partedeci = numero - ParteEnt;

        System.out.println("La parte entera es "+ParteEnt);
        System.out.println("Parte decimal: "+partedeci);
        
    }
}
