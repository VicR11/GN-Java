package tallerLoops;

import java.util.Scanner;

public class Punto1CajaRegistradora {
    public static void comprarMenu(){

        Scanner scanner = new Scanner(System.in);
        double total= 0.0;
        int opcion =0;
        do{
            System.out.println("\nIngrese la opcion que desea comprar: ");
            System.out.println("Menu:");
            System.out.println("1.Hamburguesa $15.000");
            System.out.println("2.Papas $6000");
            System.out.println("3.Gaseosa $3500");
            System.out.println("4.Pan $5000");
            System.out.println("5.Salir");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Entregando hamburguesa");
                    total+=15000;
                    break;
                case 2:
                    System.out.println("Entregando Papas");
                    total+=6000;
                    break;
                case 3:
                    System.out.println("Entregando Gaseosa");
                    total+=3500;
                    break;
                case 4:
                    System.out.println("Entregando Pan");
                    total+=5000;
                    break;
            }
        }while(opcion != 5);

        System.out.println("Total a pagar: "+total);
        System.out.println("Ingrese su pago: ");
        int pago = scanner.nextInt();


        if (pago - total > 0) {
            System.out.println("Su cambio es de: " + (pago - total));
            System.out.println("Gracias por su compra");
        } else if (pago < total) {
            System.out.println("Aun faltan " + (total - pago) + " para pagar el total de la compra");
        } else {
            System.out.println("Gracias por su compra");
        }



    }
}
