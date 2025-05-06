package tallerLoops;

import java.util.Scanner;

public class Punto4CajeroAutomatico {
    public static void utilizarCajero() {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        int opcion = 0;
        do {
            System.out.println("\nIngrese la opcion que desea elegir: ");
            System.out.println("Menu:");
            System.out.println("1.Consultar saldo");
            System.out.println("2.Retirar dinero");
            System.out.println("3.Depositar dinero");
            System.out.println("4.Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("su saldo es: "+saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a retirar: ");
                    double valorRetirar = scanner.nextDouble();
                    if(saldo > valorRetirar){
                        saldo -= valorRetirar;
                        System.out.println("Retirando...\nNuevo saldo:"+saldo);
                    }else{
                        System.out.println("Fondos insuficientes");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el valor a depositar: ");
                    double valorDepositar = scanner.nextDouble();
                        saldo += valorDepositar;
                        System.out.println("Depositando...\nNuevo saldo:"+saldo);
                    break;
                case 4:
                    System.out.println("Saliendo..");
                    break;
            }
        } while (opcion != 4);
    }
}
