import java.util.*;
public class Ejercicio34 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el monto de la compra");
        double monto = entrada.nextDouble();
        double descuento = 0;

        if (monto>1000) {
            descuento = monto * 0.10;
        }else if(monto>500 && monto<=1000){
            descuento = monto * 0.20;
        }
        double total = monto-descuento;
        System.out.println("El descuento fue de "+descuento);
        System.out.println("El valor a pagar en total es: "+total);
    }
}
