import java.util.Random;
import java.util.*;
public class Ejercicio23 {
    public static void main(String[] args) {

        // Generar los dígitos aleatorios distintos entre 0 y 9
        int digito1, digito2, digito3;
        do {
            digito1 = (int) (Math.random() * 10);
            digito2 = (int) (Math.random() * 10);
            digito3 = (int) (Math.random() * 10);
        } while (digito1 == digito2 || digito1 == digito3 || digito2 == digito3);

        int intentos = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al juego del Rojo-Amarillo-Verde!");
        System.out.println("Intenta adivinar los 3 dígitos distintos entre 0 y 9 en el menor número de intentos posible.");

        int d1=0,d2=0,d3=0;

        do {
            intentos++;
            System.out.println("Por favor ingresa tus 3 dígitos:");
             d1 = sc.nextInt();
             d2 = sc.nextInt();
             d3 = sc.nextInt();

            if (d1 == digito1) {
                System.out.println("VERDE");
            } else if (d1 == digito2 || d1 == digito3) {
                System.out.println("AMARILLO");
            } else {
                System.out.println("ROJO");
            }

            if (d2 == digito2) {
                System.out.println("VERDE");
            } else if (d2 == digito1 || d2 == digito3) {
                System.out.println("AMARILLO");
            } else {
                System.out.println("ROJO");
            }

            if (d3 == digito3) {
                System.out.println("VERDE");
            } else if (d3 == digito1 || d3 == digito2) {
                System.out.println("AMARILLO");
            } else {
                System.out.println("ROJO");
            }

        } while (digito1 !=d1 || digito2 !=d2 || digito3 !=d3);

        System.out.println("¡Felicidades! Adivinaste los 3 dígitos en " + intentos + " intentos.");

        sc.close();
    }
}
