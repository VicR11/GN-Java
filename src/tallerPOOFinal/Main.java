package tallerPOOFinal;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // capturar numero double con .

        int opcion =0;

        ///Punto 3
        Estudiante estudiante1 = new Estudiante("Carol", 1234, 4.2);
        Estudiante estudiante2 = new Estudiante("Jose", 8765, 2.0);
        Estudiante estudiante3 = new Estudiante("Camilo", 9087, 3.2);

        escuela.agregarEstudiante(estudiante1);
        escuela.agregarEstudiante(estudiante2);
        escuela.agregarEstudiante(estudiante3);

        escuela.buscarEstudiante(232);

        System.out.println("----- aqui termina el punto 3 -----\n");

        ///Punto 4

        do {
            Estudiante estudiante = new Estudiante();
            System.out.println("Ingrese una opcion:");
            System.out.println("1.Agregar estudiante\n2.buscar estudiante por ID\n3.Mostrar lista de estudiantes\n4.Salir");
            opcion=scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese nombre");
                        estudiante.setNombre(scanner.nextLine());
                        System.out.println("Ingrese ID");
                        estudiante.setNumeroId(scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("Ingrese calificación");
                        estudiante.setCalificacion(scanner.nextDouble());
                        escuela.agregarEstudiante(estudiante);
                        break;

                    case 2:
                        System.out.println("Ingrese el ID del estudiante");
                        int idEstudiante = scanner.nextInt();
                        if (escuela.buscarEstudiante(idEstudiante) instanceof Estudiante) {
                            System.out.println("El estudiante si existe en la escuela\n");
                            System.out.println(escuela.buscarEstudiante(idEstudiante));
                        } else {
                            System.out.println("El estudiante con id " + idEstudiante + " no existe en la escuela");
                        }

                        break;
                    case 3:
                        escuela.mostrarLista();
                        break;

                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción invalida");
                        break;

                }
            }
            catch (InputMismatchException e) {
                    System.out.println("Error: Entrada inválida. Por favor ingrese el tipo de dato correcto.");
                    scanner.nextLine();
                }


        }while(opcion != 4);
        scanner.close();

    }




}
