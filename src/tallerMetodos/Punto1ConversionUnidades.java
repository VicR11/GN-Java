package tallerMetodos;

import java.util.Scanner;

public class Punto1ConversionUnidades {

    public static double convertirMetrosCentimetros(double metros){
        return metros*100.0;
    }

    public static double convertirKiloLibra(double kilos){
        return kilos* 2.20462;
    }

    public static double convertirCelsiusFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    public static void mostrarConversion(){
        Scanner scanner = new Scanner(System.in);
        double valor= 0.0;
        int opcion =0;
        do{ System.out.println("\nConversiones:");
            System.out.println("Ingrese el valor que desea convertir");
            valor = scanner.nextDouble();
            System.out.println("\nIngrese una opción: ");
            System.out.println("1.Convertir de metros a centímetros");
            System.out.println("2.Convertir de kilogramos a libras");
            System.out.println("3.Convertir de Celsius a Fahrenheit.");
            System.out.println("4.Salir");
            opcion = scanner.nextInt();



            switch (opcion){
                case 1:
                    System.out.println("Resultado: "+convertirMetrosCentimetros(valor)+" cm");
                    break;
                case 2:
                    System.out.println("Resultado: "+convertirKiloLibra(valor)+" lb");
                    break;
                case 3:
                    System.out.println("Resultado: "+convertirCelsiusFahrenheit(valor)+" F");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }while(opcion != 4);

        scanner.close();

    }


}
