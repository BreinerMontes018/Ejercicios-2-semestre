import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingresa tu año de nacimiento: ");
        int anoNacimiento = entrada.nextInt();

        System.out.print("Ingresa el año actual: ");
        int anoActual = entrada.nextInt();

        int edad = anoActual - anoNacimiento;
        int diasVividos = edad * 365;
        int diasDurmiendo = (int)(diasVividos * 0.34);

        System.out.println(nombre + " ha dormido aproximadamente " + diasDurmiendo + " días en su vida.");
    }
}
