package tallerOPP.Punto1CuentaBancaria;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;
    private boolean detallado;

    public Auto() {

    }

    public Auto(String marca, String modelo, int anio, boolean detallado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = 0;
        this.detallado = detallado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isDetallado() {
        return detallado;
    }

    public void setDetallado(boolean detallado) {
        this.detallado = detallado;
    }

    public void actualizarKilometraje(int km){
        if(km >0) {
            this.kilometraje += km;
            System.out.println("Actualizando kilometraje");
        }else{
            System.out.println("Debe agregar un km positivo");
        }
    }

    public void mostrarInformacion(){
        System.out.println("\nAuto:\nMarca:"+this.marca+"\nModelo:"+this.modelo+"\nAño:"+this.anio);
        if(this.detallado){
            System.out.println("Kilometraje: "+this.kilometraje);
        }
    }
}
