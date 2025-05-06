package tallerLoops;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Punto5GeneradorContrasenia {

    public static void generar() {
        Scanner scanner = new Scanner(System.in);
    String combinacion = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";


    Random random = new Random();
    int numeroAleatorio = 0;
    String contrasenia = "";

    System.out.println("Ingrese la longitud de la contraseña que quiere calcular(Debe ser mayor a 2):");
    int longitudContrasenia = scanner.nextInt();
    String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[^A-Za-z\\d]).+$";


    while(!Pattern.matches(regex,contrasenia)) {
        contrasenia="";
        for (int i = 0; i < longitudContrasenia; i++) {
            numeroAleatorio = random.nextInt(combinacion.length());
            contrasenia += combinacion.charAt(numeroAleatorio);
        }
    }
    System.out.println(contrasenia);
    scanner.close();
}

}
