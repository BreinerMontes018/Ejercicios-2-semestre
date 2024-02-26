import java.util.*;
public class Ejercicio31 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculemos el area de un triangulo");
        System.out.println("----------------------------------");
        System.out.println("Ingresa la altura en milimetro");
        double h = entrada.nextDouble();
        System.out.println("Ingrese la base en milimetros");
        double b = entrada.nextDouble();
        double area = h*b/2;
        double centi = area/10;
        double metrocuadro = h*b;
        System.out.println("El area de este triangulo en milimetros es : "+area);
        System.out.println("El area de este triangulo en centimetros es : "+centi);
        System.out.println("El area de este triangulo en milimetros cuadrados es : "+metrocuadro);

    }

    
}
