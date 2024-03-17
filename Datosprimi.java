import java.util.*;
public class Datosprimi {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
    int entero = entrada.nextInt();

    System.out.println("Ingrese un número decimal:");
    double decimal = entrada.nextDouble();

    System.out.println("Ingrese un carácter:");
    char caracter = entrada.next().charAt(0);

    System.out.println("Ingrese un booleano (true/false):");
    boolean booleano = entrada.nextBoolean();

    System.out.println("Ingrese un byte:");
    byte byteNum = entrada.nextByte();

    System.out.println("Ingrese un corto:");
    short corto = entrada.nextShort();

    System.out.println("Ingrese un largo:");
    long largo = entrada.nextLong();

    System.out.println("Número entero: " + entero);
    System.out.println("Número decimal: " + decimal);
    System.out.println("Carácter: " + caracter);
    System.out.println("Booleano: " + booleano);
    System.out.println("Byte: " + byteNum);
    System.out.println("Corto: " + corto);
    System.out.println("Largo: " + largo);

    }
}
