import java.util.*;
public class Ejercicio16 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Consulta si ganas o perdiste tu examen matematico");
        System.out.println();
        System.out.println("Digite la nota");
        float nota = entrada.nextFloat();
        if(nota<3){
            System.out.println("Lo lamento usted perdio el examen");
        }else{
            System.out.println("Felicidades pasaste el examen");
        }
    }
}
