package tallerIfSwith;

import java.util.Scanner;

public class Punto1FacturacionSupermercado {

    public static void calcularDescuento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el total de su compra: ");
        double totalCompra = scanner.nextDouble();

        System.out.println("Ingrese la cantidad de productos que compro: ");
        int totalProductos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tiene menbresia: ");
         String menbresia = scanner.nextLine();

        double totalPagar = 0;
        if(menbresia.toLowerCase().equals("si")){
            totalPagar = totalCompra - (totalCompra*0.1);
            if(totalProductos>10){
                totalPagar = totalPagar - (totalCompra*0.05);
            }
        }else{
            totalPagar = totalCompra;
        }
        /*if(menbresia.toLowerCase() == "si" && totalProductos>10){
            totalPagar = totalCompra - (totalCompra*0.15);
        }else if(menbresia.toLowerCase() == "si" && totalProductos<10){
            totalPagar = totalCompra - (totalCompra*0.1);
        }else{
            totalPagar = totalCompra;
        }*/

        System.out.println("El valor total a pagar es: "+totalPagar);


    }
}
