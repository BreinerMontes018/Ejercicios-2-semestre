import java.util.*;
public class Ejercicio9 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conozca el iva de algun precio");
        System.out.println("");
        System.out.println("Introduca el precio que desee conocer el iva");
        float precio = entrada.nextFloat();
        System.out.println("Introduzca el porcentaje de iva");
        float iva = entrada.nextFloat();
        float tasaIva = iva/100;
        float totalIva= precio*tasaIva;
        System.out.println("El iva de este producto es de "+totalIva);
    }
    
}
