import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
         //Programa que de acuerdo a una cantidad de grados centígrados ingresadas por
//teclado, realice la conversión a grados fahrenheit. (Multiplica por 9, divide entre 5,
//después suma 32).
System.out.println("Ingresa la cantidad de grados centigrados ");
double centigrados = entrada.nextDouble();

double fahrenheit = (centigrados*9)/5+32;
System.out.println("La cantidad en grados fahrenheit es "+fahrenheit);

    }
}
