package tallerOPP.Punto1CuentaBancaria;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public Libro(String titulo, String autor, int anioPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar(){
        if(this.disponible){
            System.out.println("Prestando...");
            this.disponible = false;
        }else{
            System.out.println("El libro se encuentra prestado");
        }
    }

    public void devolver(){
        if(!this.disponible){
            System.out.println("Entregando...");
            this.disponible = true;
        }else{
            System.out.println("Verifique si el libro esta prestado");
        }
    }

    public void mostrarDetalles(){
        System.out.println("Libro\nTitulo:"+this.titulo+"\nAutor:"+this.autor+"\nAño de publicación:"+this.anioPublicacion+"\nDisponible:"+this.disponible+"\n");
    }
}
