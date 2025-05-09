package tallerOOPAvanzado.com.veterinaria.animales;

public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String historialMedico;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, double peso, String historialMedico) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.historialMedico = historialMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public void mostrarRegistro(){
        System.out.println("Ficha registro");
        System.out.println("Nombre "+nombre);
        System.out.println("Raza "+raza);
        System.out.println("Edad "+edad);
        System.out.println("Peso "+peso);
    }

    @Override
    public String toString() {
        return "Perro:" +
                "nombre='" + nombre +
                " raza='" + raza +
                " edad=" + edad +
                " peso=" + peso +
                " historialMedico='" + historialMedico + '\'';

    }
}

