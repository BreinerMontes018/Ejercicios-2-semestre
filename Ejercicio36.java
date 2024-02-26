import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las horas de estacionamiento: ");
    int horas = entrada.nextInt();
    
    System.out.println("Ingrese los minutos de estacionamiento: ");
    int minutos = entrada.nextInt();
    
    int totalMinutos = horas * 60 + minutos;
    int horasTotales = totalMinutos / 60;
    
    if(totalMinutos % 60 != 0) {
        horasTotales++;
    }
    
    int costo = horasTotales * 15;
    
    System.out.println("El cliente debe pagar: $" + costo);
}

}
