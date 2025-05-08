package tallerColecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto1GestionarTareas {
    static ArrayList<String> tareas= new ArrayList<>();

    public static ArrayList agregarTareas(String tarea){
        tareas.add(tarea);
        return  tareas;
    }

    public static ArrayList mostrarTareas(){
        for (String tarea: tareas){
            System.out.println(tarea);
        }
        return  tareas;
    }

    public static ArrayList eliminarrTareas(String tarea){
        tareas.remove(tarea);
        return  tareas;
    }

    public static int tareasPendientes(){;
        return  tareas.size();
    }

    public static void mostrarOpciones(){
        Scanner scanner = new Scanner(System.in);
        String tarea= "";
        int opcion =0;
        do{
            System.out.println("\nLista de tareas:");

            System.out.println("\nIngrese una opción: ");
            System.out.println("1.Agregar tarea");
            System.out.println("2.Mostrar tarea");
            System.out.println("3.Marcar como completa");
            System.out.println("4.Mostrar pendientes");
            System.out.println("5.Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion){
                case 1:
                    System.out.println("Ingrese la tarea:");
                    tarea = scanner.nextLine().toLowerCase();
                    System.out.println("Agregando...");
                    System.out.println(agregarTareas(tarea));
                    break;
                case 2:
                    System.out.println(mostrarTareas());
                    break;
                case 3:
                    System.out.println("Ingrese la tarea a eliminar:");
                    tarea = scanner.nextLine().toLowerCase();
                    System.out.println("Eliminando...");
                    System.out.println(eliminarrTareas(tarea));
                    break;
                case 4:
                    System.out.println("Tareas pendintes: "+tareasPendientes());
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
