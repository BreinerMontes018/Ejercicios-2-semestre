import java.util.*;
public class Ejercicio30 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora de metros");
        System.out.println("*********************");
        System.out.println("Digite la cantidad de kilometros");
        int kilometros = entrada.nextInt();
        int resul = Calcularmetros(kilometros);

        System.out.println("La cantidad de metros en "+kilometros+" kilometros es: "+resul);
    }
    public static int Calcularmetros(int kilo){
        int calcular = kilo*1000;
        return calcular;
    }
}
