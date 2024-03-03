import java.util.*;
public class Ejercicio43 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conozcamos el numero menor");
        System.out.println("Digita el primer numero");
        double n1 = entrada.nextDouble();
        System.out.println("Digita el segundo numero");
        double n2 = entrada.nextDouble();
        if (n1<n2) {
            System.out.println("El numero menor es "+n1);
        }else{
            System.out.println("El numero maner es "+n2);
        }
    }
}
