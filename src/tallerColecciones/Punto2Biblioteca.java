package tallerColecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Punto2Biblioteca {
    static Set<String> libros = new HashSet<>();

   public static Set agregarLibro(String libro){
       libros.add(libro);
       return libros;
   }

    public static void mostrarLibros(){
       for(String libro: libros){
           System.out.println(libro);
       }
    }

    public static boolean verificarLibro(String libro){
        return  libros.contains(libro);
    }

    public static int mostrarCantidadLibros(){
       return libros.size();
    }

    public static void mostrarOpciones(){
        Scanner scanner = new Scanner(System.in);
        String libro= "";
        int opcion =0;
        do{
            System.out.println("\nBiblioteca:");

            System.out.println("\nIngrese una opción: ");
            System.out.println("1.Agregar libro");
            System.out.println("2.Mostrar libros disponibles");
            System.out.println("3.Verificar libro");
            System.out.println("4.Número total de libros únicos");
            System.out.println("5.Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion){
                case 1:
                    System.out.println("Ingrese el libro:");
                    libro = scanner.nextLine().toLowerCase();
                    System.out.println("Agregando...");
                    System.out.println(agregarLibro(libro));
                    break;
                case 2:
                    mostrarLibros();
                    break;
                case 3:
                    System.out.println("Ingrese el libro a verificar:");
                    libro = scanner.nextLine().toLowerCase();
                    System.out.println("Verificando...");
                    System.out.println("Disponible: "+verificarLibro(libro));
                    break;
                case 4:
                    System.out.println("Cantidad de libros unicos: "+mostrarCantidadLibros());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción invalida");
            }
        }while(opcion != 5);

        scanner.close();

    }

}
