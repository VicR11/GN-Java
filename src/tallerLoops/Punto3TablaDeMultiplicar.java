package tallerLoops;

import java.util.Scanner;

public class Punto3TablaDeMultiplicar {
    public static void mutiplicar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tabla de Multiplicar\nIngrese un numero del 1 al 10: ");
        int numero = scanner.nextInt();
        int contador =1;
        while(contador<=10 && (numero>=1 && numero<=10)){
            System.out.println(contador+" * "+numero +" = "+ numero*contador);
            contador++;
        }
    }
}
