package tallerOOPAvanzado.com.veterinaria;

import tallerOOPAvanzado.com.veterinaria.animales.Perro;
import tallerOOPAvanzado.com.veterinaria.recepcion.Registro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion =0;
        Registro registro = new Registro();

        //Perro perro1= new Perro("Lucy","criolla",2,25,"Vacunas aldia");

        do {

            System.out.println("Ingrese una opcion:");
            System.out.println("1.Agregar perro");
            System.out.println("2.Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    Perro perro2 = new Perro();

                System.out.println("Ingrese el nombre del perro:");
                perro2.setNombre(scanner.nextLine());

                System.out.println("Ingrese la raza del perro:");
                perro2.setRaza(scanner.nextLine());

                System.out.println("Ingrese la edad del perro:");
                perro2.setEdad(scanner.nextInt());

                System.out.println("Ingrese el peso del perro:");
                perro2.setPeso(scanner.nextInt());
                scanner.nextLine();

                System.out.println("Ingrese el historial medico del perro:");
                perro2.setHistorialMedico(scanner.nextLine());

                registro.resgistrarPerro(perro2);

                break;

                case 2:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion != 2);


        registro.mostrarPerros();

    }
}
