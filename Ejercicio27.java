import java.util.*;
public class Ejercicio27 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String nombre = entrada.nextLine();
        
        System.out.println("¿Eres hombre o mujer? (h/m)");
        String genero = entrada.nextLine();
        
        if (genero.equalsIgnoreCase("h")) {
            System.out.println("Bienvenido " + nombre);
        } else if (genero.equalsIgnoreCase("m")) {
            System.out.println("Bienvenida " + nombre);
        } else {
            System.out.println("Hola indeciso");
        }
    }
    
}
