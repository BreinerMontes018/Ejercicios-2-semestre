import java.util.Random;
import java.util.Scanner;
public class Juegoparques {
    public static void main(String[] args) {
        Random random = new Random();
        int steps = 0;
        int seguros = 0;

        System.out.println("Comenzando el juego...");

        while (steps < 1000) {
            int dado = random.nextInt(6) + 1;
            steps += dado;
            System.out.println("Dado: " + dado + ", Pasos: " + steps);

            if (steps % 250 == 0) {
                seguros++;
                System.out.println("Se aseguró en el paso " + steps);
            }
        }

        System.out.println("\nJuego terminado.");
        System.out.println("Se aseguró " + seguros + " veces.");

    }

}

