package tallerPOOFinal;

import java.util.HashSet;
import java.util.Set;

public class Escuela {
    private Set<Estudiante> escuela;

    public Escuela() {
        this.escuela = new HashSet<>();
    }

    public void agregarEstudiante(Estudiante estudiante){
        if(!(buscarEstudiante(estudiante.getNumeroId()) instanceof Estudiante)) { // Validar Id de estudiante
            if (validarEstudiante(estudiante)) {
                escuela.add(estudiante);
                System.out.println("Agregando estudiante " + estudiante.getNombre() + " ...\n");
            }
        }else {
            System.out.println("Ya se encuentra registrado un estudiante con el mismo ID\n");
        }
    }

    public Estudiante buscarEstudiante(int numeroId ){
        for (Estudiante estudiante : escuela){
            if(numeroId == estudiante.getNumeroId()){
                return estudiante;
            }
        }
        return null;
    }


    public void mostrarLista(){
        System.out.println(escuela);
    }

    public boolean validarEstudiante(Estudiante estudiante){
        boolean flag = true;
        if(estudiante.getNombre().trim().isEmpty() || estudiante.getNombre().length() <= 2){
            System.out.println("\u001B[31m"+"Nombre invalido\n"+"\u001B[0m");
            flag = false;
        }
        if(estudiante.getCalificacion() >10 || estudiante.getCalificacion()<0){
            System.out.println("\u001B[31m"+"El rango de calificación debe ser de 0 a 10\n"+"\u001B[0m");
            flag = false;
        }
        if(estudiante.getNumeroId() <0) {
            System.out.println("\u001B[31m"+"El ID debe ser un numero positivo\n"+"\u001B[0m");
            flag = false;
        }
        return flag;
    }


}
