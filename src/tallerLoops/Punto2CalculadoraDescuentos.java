package tallerLoops;

import java.util.Scanner;

public class Punto2CalculadoraDescuentos {
    public static void calcularDescuento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agregue el valor de su producto: ");
        double precioProducto = scanner.nextDouble();

        for (int i=10; i<=50; i+=10){
            System.out.println("Descuento del "+i+"% para su producto es:"+(precioProducto-(precioProducto*(i/100.0))));
        }
    }
}
