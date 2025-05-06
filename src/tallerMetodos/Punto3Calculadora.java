package tallerMetodos;

import java.util.Scanner;

public class Punto3Calculadora {
    public static double sumar(double num1, double num2) {
        return num1+num2;
    }

    public static double restar(double num1, double num2) {
        return num1-num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1*num2;
    }

    public static double dividir(double num1, double num2) {
        if(num2 == 0){
            System.out.println("No se puede dividir por 0");
            return 0.0;
        }else {
            return num1 / num2;
        }
    }

    public static double cacularPotencia(double num1, double num2) {
       return Math.pow(num1, num2);
    }

    public static void mostrarOperaciones(){
        Scanner scanner = new Scanner(System.in);
        double num1= 0.0;
        double num2= 0.0;
        int opcion =0;
        do{
            System.out.println("\nCalculadora: ");
            System.out.println("Ingrese el numero 1:");
            num1 = scanner.nextDouble();
            System.out.println("Ingrese el numero 2:");
            num2 = scanner.nextDouble();
            System.out.println("ngrese una opción del menu: ");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Calcular potencia");
            System.out.println("6.Salir");
            opcion = scanner.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("Resultado suma: "+sumar(num1,num2));
                    break;
                case 2:
                    System.out.println("Resultado resta: "+restar(num1,num2));
                    break;
                case 3:
                    System.out.println("Resultado multiplicacion: "+multiplicar(num1,num2));
                    break;
                case 4:
                    System.out.println("Resultado division: "+dividir(num1,num2));
                    break;
                case 5:
                    System.out.println("Resultado calcular potencia: "+cacularPotencia(num1,num2));
                    break;
                case 6:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }while(opcion != 6);

        scanner.close();

    }





}
