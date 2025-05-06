package tallerMetodos;

import java.util.Locale;
import java.util.Scanner;

public class Punto2SistemaCalificaciones {
    public static double calcularPromedio(double nota1, double nota2, double nota3){
        return (nota1+nota2+nota3)/3;
    }

    public static String calcularAprobacion(double promedio){
        if(promedio >= 60)
            return "Aprobó";
        else
            return "No aprobó";
    }

    public static void mostrarResultados(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para evitar error con ,
        System.out.println("Calculadora de promedios");
        System.out.println("Ingrese la nota 1: ");
        String nota1 = scanner.nextLine().replace(",", ".");
        double nota1f =  Double.parseDouble(nota1); // clase Double para usar el metodo y hacer la conversion
        System.out.println("Ingrese la nota 2: ");
        String nota2 = scanner.nextLine().replace(",", ".");
        double nota2f =  Double.parseDouble(nota1);
        System.out.println("Ingrese la nota 3: ");
        String nota3 = scanner.nextLine().replace(",", ".");
        double nota3f =  Double.parseDouble(nota1);
        scanner.close();

        double promedio = calcularPromedio(nota1f, nota2f, nota3f);
        System.out.println(calcularAprobacion(promedio));
    }


}
