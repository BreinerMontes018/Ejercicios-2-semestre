import java.util.*;
public class Ejercicio15 {
    public static void main(String[]arrgs){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conozcamos si eres mayor de edad o no");
        System.out.println("Digita tu edad");
        int edad = entrada.nextInt();
        if(edad<18){
            System.out.println("Eres menor de edad");
        }else{
            System.out.println("Eres mayor de edad");
        }
    }
}
