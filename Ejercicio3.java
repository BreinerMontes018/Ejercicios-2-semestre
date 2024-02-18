import java.util.*;
public class Ejercicio3 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conoce el area de un triangulo");
        System.out.println("Ingresa la base ");
        float base = entrada.nextFloat();
        System.out.println("Ingresa la altura");
        float altura = entrada.nextFloat();
        float area = (base*altura/2);
        System.out.println("");
        System.out.println("El area de el triangulo es "+area);
    }
}
