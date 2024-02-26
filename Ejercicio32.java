import java.util.*;
public class Ejercicio32 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculemos el area de un rectangulo");
        System.out.println("----------------------------------");
        System.out.println("Ingresa la altura en metros");
        double h = entrada.nextDouble();
        System.out.println("Ingrese la base en metros");
        double b = entrada.nextDouble();
        double area = h*b/2;
        double centi = area*100;
        double milime = area*1000;
        double metrocuadro = h*b;
        System.out.println("El area de este rectangulo en mentros es : "+area);
        System.out.println("El area de este rectangulo en centimetros es : "+centi);
        System.out.println("El area de este rectangulo en milimetros es : "+milime);
        System.out.println("Este rectangulo en metros cuadrados es : "+metrocuadro);

    }
    
}
