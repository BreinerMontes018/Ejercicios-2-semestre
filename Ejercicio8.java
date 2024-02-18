import java.util.*;
public class Ejercicio8 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Conoce el resto de una division entera");
        System.out.println();
        System.out.println("Introduzca el dividiendo");
        int dividiendo = entrada.nextInt();
        System.out.println("Introduzca el divisor");
        int divisor = entrada.nextInt();
        int resto = (dividiendo % divisor);
        System.out.println("El resto de "+dividiendo+" entre "+divisor+" es "+resto);

    }
}
