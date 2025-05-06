package tallerIfSwith;

import java.util.Scanner;

public class Punto2Veterinaria {
    public static void clasificacionMascotas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de animal: ");
        String mascota = scanner.nextLine();

        System.out.println("Ingrese la edad de su mascota: ");
        int edadMascota = scanner.nextInt();
        String resultado ="";

        switch (mascota.toLowerCase()){
            case "perro":
                resultado = "Consulta con veterinario especializado en perros";
                if(edadMascota > 5)
                    resultado += ", por tener mas de 5 años se recomienda vacuna adicional";
                break;

            case "gato":
                resultado = "Consulta con veterinario especializado en gatos";
                if(edadMascota > 5)
                    resultado += ", por tener mas de 5 años se recomienda vacuna adicional";
                break;
            case "ave":
                resultado = "Consulta con veterinario especializado en aves";
                break;
            default:
                resultado = "Consulta con veterinario especializado en otras especies";
        }

        System.out.println(resultado);

    }
}
