import java.util.*;
public class Ejercicio13 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("Digite el segundo numero");
        int num2 = entrada.nextInt();
        System.out.println("Digite el tercer numero");
        int num3 = entrada.nextInt();
        
        int ultinum1 = num1 % 10;
        int ultinum2 = num2 % 10;
        int ultinum3 = num3 % 10;

        System.out.println("El ultimo digito del primer numero es "+ultinum1);
        System.out.println("El ultimo digito del segundo numero es "+ultinum2);
        System.out.println("El ultimo digito del segundo numero es "+ultinum3);

    }
    
}
