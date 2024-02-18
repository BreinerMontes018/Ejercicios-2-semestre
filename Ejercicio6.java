import java.util.*;
public class Ejercicio6 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conoce la media aritmetrica de 3 numeros");
        System.out.println("Escriba el primer numero ");
        float numer1 = entrada.nextFloat();
        System.out.println("Escriba el segundo numero ");
        float numer2 = entrada.nextFloat();
        System.out.println("Escriba el tercer numero ");
        float numer3 = entrada.nextFloat();
        float media = Mediaaritmetrica(numer1, numer2, numer3);
        System.out.println("La media aritmetica es "+media);
    

    }
    public static float Mediaaritmetrica(float n1, float n2, float n3){
        float media = (n1+n2+n3)/3;
        return media;
    }
    
}
