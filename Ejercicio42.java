import java.util.*;
public class Ejercicio42 {
    public static void main(String[]args){
        Scanner entrada = new  Scanner(System.in);
        System.out.println("Cuantos kilovoltios requiere el sistema");
        int kilo = entrada.nextInt();
        int totalvaltios = (kilo*1000);
        double naran = totalvaltios/0.05;
        System.out.println("Se necesitan "+naran+" para un sistema de "+kilo+" kilovoltios");
        double peso = naran*6;
        double tonelada = peso/1000000;
        System.out.println("Suponiendo que cada naranja pesa 6 gramos se necesitan "+tonelada+" toneladas");

    }
}
