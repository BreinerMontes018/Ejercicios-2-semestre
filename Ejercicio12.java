import java.util.*;
public class Ejercicio12 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculemos de diferentes formas");
        System.out.println("Escribe un primer numero");
        double num1 = entrada.nextDouble();
        System.out.println("Escribe un segundo numero");
        double num2 = entrada.nextDouble();
        System.out.println("Escribe un tercer numero");
        double num3 = entrada.nextFloat();
        double suma = Suma(num1, num2, num3);
        double promedio = Promedio(num1, num2, num3);
        double doble = num1*2;
        double triple = num2*3;
        double cuadrado = Math.pow(num3, 2);
        System.out.println("La suma de los tres numeros es "+suma);
        System.out.println("El promedio de los tres numeros "+promedio);
        System.out.println("El doble del primer numero es "+doble);
        System.out.println("El triple del segundo numero es "+triple);
        System.out.println("El cuadrado del tercer numero es "+cuadrado);

    }
    public static double Suma(double n1, double n2, double n3){
        double suma = (n1+n2+n3);
        return suma;
    }
    public static double Promedio(double n1,double n2, double n3){
        double promedio = (n1+n2+n3)/3;
        return promedio;
    }
    
}
