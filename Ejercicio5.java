import java.util.*;
public class Ejercicio5 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conoce el area de un rombo");
        System.out.println("Digite el diagonal mayor");
        double diagoMY = entrada.nextDouble();
        System.out.println("Digite el diagonal menor");
        double diagoMN = entrada.nextDouble();
        double area = CalcularArea(diagoMY, diagoMN);
        System.out.println("El area de el rombo es "+area);
    }
    public static Double CalcularArea(double d1, double d2){
        double area = (d1*d2)/2;
        return area;
    }
}
