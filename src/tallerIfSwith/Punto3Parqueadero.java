package tallerIfSwith;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Punto3Parqueadero {
    public static void clasificacionMascotas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de veniculo: ");
        String vehiculo = scanner.nextLine();

        System.out.println("Ingrese la hora de llegada usando formato de 24 horas: ");
        String horaLlegada = scanner.nextLine();
        double resultado =0.0;
        double duracionTotal = 0.0;
        LocalTime horaActual =  LocalTime.now().withSecond(0).withNano(0);
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("H:mm");
        LocalTime horaLlegadaFormato = LocalTime.parse(horaLlegada, formatoHora);
        LocalTime horaLimite = LocalTime.parse("20:00", formatoHora);

        Duration duracion = Duration.between(horaLlegadaFormato, horaActual);
        duracionTotal = duracion.toHours();
        double minutos = duracion.toMinutes();

        System.out.println("minutos: "+minutos);

        if(minutos > 30) {
            duracionTotal += 1;
        }

        switch (vehiculo.toLowerCase()){
            case "bicicleta":
                resultado = duracionTotal*5000;
                if(horaLlegadaFormato.isAfter(horaLimite))
                    resultado += resultado*0.2;
                break;

            case "auto":
                resultado = duracionTotal*30000;
                if(horaLlegadaFormato.isAfter(horaLimite))
                    resultado += resultado*0.2;
                break;
            case "moto":
                resultado = duracionTotal*15000;
                if(horaLlegadaFormato.isAfter(horaLimite))
                    resultado += resultado*0.2;
                break;
            default:
                resultado = 0.0;
        }

        System.out.println("Total a pagar: $"+resultado);

    }
}
