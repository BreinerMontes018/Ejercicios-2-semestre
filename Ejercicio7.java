import java.util.*;
public class Ejercicio7 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.println("Conoce si un numero es positivo o negativo");
        System.out.println("");
        System.out.println("Introduzca un numero");
        float num = entrada.nextFloat();
        if(num<0){
            System.out.println("Es un numero negativo");
        }else{
            System.out.println("Es un numero positivo");
        }
        
    }
}
