package tallerColecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Punto3DirectorioTrabajadores {
    static HashMap<String, Double> trabajadores = new HashMap<String, Double>();

    public static HashMap agregarTrabajador(String trabajador, Double salario){
        trabajadores.put(trabajador,salario);
        return trabajadores;
    }

    public static void mostrarTrabajadores(){
       for (String trabajadorNombre:trabajadores.keySet()){
           System.out.println("Nombre: "+trabajadorNombre+" Salario:"+trabajadores.get(trabajadorNombre));
       }
    }

    public static HashMap actualizarSalario(String trabajador, Double nuevoSalario){
        trabajadores.put(trabajador, nuevoSalario);
        return trabajadores;
    }

    public static double calcularSlarioPromedio(){
        double salarioSuma = 0.0;
        for (String trabajador: trabajadores.keySet()){
            salarioSuma+= trabajadores.get(trabajador);
        }

        return  salarioSuma/trabajadores.size();
    }

    public static void mostrarOpciones(){
        Scanner scanner = new Scanner(System.in);
        String trabajador= "";
        Double salario = 0.0;
        int opcion =0;
        do{
            System.out.println("\nDirectorio trabajadores:");

            System.out.println("\nIngrese una opción: ");
            System.out.println("1.Agregar trabajador");
            System.out.println("2.Mostrar trabajadores");
            System.out.println("3.Actualizar salario");
            System.out.println("4.Calcular salario promedio");
            System.out.println("5.Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion){
                case 1:
                    System.out.println("Ingrese el trabajador:");
                    trabajador = scanner.nextLine().toLowerCase();
                    System.out.println("Ingrese el salario:");
                    salario = scanner.nextDouble();
                    System.out.println("Agregando...");
                    System.out.println(agregarTrabajador(trabajador,salario));
                    break;
                case 2:
                    mostrarTrabajadores();
                    break;
                case 3:
                    System.out.println("Ingrese el trabajador:");
                    trabajador = scanner.nextLine().toLowerCase();
                    System.out.println("Ingrese el nuevo salario:");
                    salario = scanner.nextDouble();
                    System.out.println("Actualizando...");
                    System.out.println("Disponible: "+actualizarSalario(trabajador,salario));
                    break;
                case 4:
                    System.out.println("Salario promedio: "+calcularSlarioPromedio());
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
