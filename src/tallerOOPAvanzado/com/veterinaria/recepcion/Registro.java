package tallerOOPAvanzado.com.veterinaria.recepcion;

import tallerOOPAvanzado.com.veterinaria.animales.Perro;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    public Registro() {
    }

    ArrayList<Perro> perrosRegistrados = new ArrayList<>();

    public void resgistrarPerro(Perro perroRegistrado){
        perrosRegistrados.add(perroRegistrado);

    }

    public void mostrarPerros(){
        for (Perro perro : perrosRegistrados){
            System.out.println("nombre: "+perro.toString());
        }
    }
}
