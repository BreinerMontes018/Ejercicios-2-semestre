import java.util.*;
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa la edad de la persona: ");
        int edad = entrada.nextInt();
        
        int gramosConsumidos = edad * 1000 * 8;
        
        System.out.println("La persona ha consumido " + gramosConsumidos + " gramos de fruta.");
        
        int manzanasConsumidas = gramosConsumidos / 4;
        
        System.out.println("La persona ha consumido " + manzanasConsumidas + " manzanas.");
        
    }
}
