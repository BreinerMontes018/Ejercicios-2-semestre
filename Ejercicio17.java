import java.util.*;
public class Ejercicio17 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conozcamos el numero mayor de dos numeros");
        System.out.println();
        System.out.println("Digita el primer numero");
        float num1 = entrada.nextFloat();
        System.out.println("Digite el segundo numero");
        float num2 = entrada.nextFloat();
        if(num1<num2){
            System.out.println("El numero mayor es "+num2);
        }else{
            System.out.println("El numero mayor es "+num1);
        }
    }
}
