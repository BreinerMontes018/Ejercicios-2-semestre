import java.util.*;
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas en el estacionamiento:");
        int horas = entrada.nextInt();
        System.out.println("Ingrese la cantidad de minutos en el estacionamiento:");
        int minutos = entrada.nextInt();
        int totalHoras = horas;
        if (minutos > 10) {
            totalHoras++;
        }
        int costo = totalHoras*15;
        
        System.out.println("El cliente debe pagar " + costo);
    }
    }

