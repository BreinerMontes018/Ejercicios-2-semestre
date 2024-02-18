import java.util.*;
public class Ejercicio20 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        double [] notas = new double [5];
        System.out.println("Ingresa las notas");
        for(int i=0;i<5;i++){
            System.out.println("Nota "+(i+1)+" : ");
            notas[i]= entrada.nextDouble();
        }
        double suma = 0;
        for(int i=0;i<5;i++){
            suma = suma + notas[i];
        }
        double promedio = suma/5;

        System.out.println("La suma de las notas es "+suma);
        System.out.println("El promedio de las notas es "+promedio);
        System.out.println("El doble de las notas son:");
        for(int i=0;i<5;i++){
            double doble = (notas[i]*2);
            System.out.println("El doble de "+notas[i]+" es "+doble);
        }
    }
}
