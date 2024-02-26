import java.util.*;
public class Ejercicio33 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int totalSalarios = 0,contarMujeres = 0,contarVarones = 0,contadorMas700 = 0;
        
        System.out.print("Ingrese la cantidad de empleados: ");
        int n = entrada.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sexo del empleado " + i + " (F/M): ");
            String sexo = entrada.next();
            
            System.out.print("Ingrese el salario del empleado " + i + ": ");
            int salario = entrada.nextInt();
            
            
            if (salario > 700) {
                contadorMas700++;
            }
            totalSalarios = totalSalarios + salario;
            
            
            if (sexo.equalsIgnoreCase("F")) {
                contarMujeres++;
            } else {
                contarVarones++;
            }
        }
        
        
        double promedioSalarios = totalSalarios / n;
        double porcentajeMujeres = contarMujeres * 100 / n;
        double porcentajeVarones = contarVarones * 100 / n;
        
        System.out.println("a) Cantidad de personas que ganan más de 700 al mes: " + contadorMas700);
        System.out.println("b) Promedio de salarios: " + promedioSalarios);
        System.out.println("c) Porcentaje de mujeres que trabajan en la empresa: " + porcentajeMujeres + "%");
        System.out.println("d) Porcentaje de varones que trabajan en la empresa: " + porcentajeVarones + "%");
    
    }
}
