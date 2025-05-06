package tallerIfSwith;

import java.util.Scanner;

public class Punto4TiendaDeRopa {
    public static void   calculoPromocion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de prenda que desea comprar (camisa, pantalón, chaqueta): ");
        String prenda = scanner.nextLine();
        System.out.println("Ingrese la cantidad que desea comprar: ");
        int cantidadPrenda = scanner.nextInt();
        double valorTotal = 0.0;

        switch (prenda.toLowerCase()){
            case "camisa":
                valorTotal = cantidadPrenda*35000;
                if(cantidadPrenda > 5)
                    valorTotal -= valorTotal*0.15;
                break;

            case "pantalón":
                valorTotal = cantidadPrenda*89000;
                if(cantidadPrenda > 5)
                    valorTotal -= valorTotal*0.15;
                break;
            case "chaqueta":
                valorTotal = cantidadPrenda*120000;
                if(cantidadPrenda > 5)
                    valorTotal -= valorTotal*0.15;
                break;
            default:
                valorTotal = 0.0;
        }

        System.out.println("Cantidad total a pagar: "+valorTotal);


    }
}
