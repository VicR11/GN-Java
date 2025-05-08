package tallerOPP.Punto1CuentaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String nombreCliente;
    private double total;
    private List<String> productos;

    public Pedido(){
        this.total = 0.0;
        this.productos = new ArrayList<>();
    }
    public Pedido(int numeroPedido, String nombreCliente) {
        this.numeroPedido = numeroPedido;
        this.nombreCliente = nombreCliente;
        this.total = 0.0;
        this.productos = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public void agregarProducto(String producto, double precio){
        if(precio > 0){
            this.productos.add(producto);
            this.total+=precio;
            System.out.println("Agregando producto....");
        }else{
            System.out.println("El precio debe ser un valor positivo");
        }
    }

    public void calcularDescuento(double porcentaje){
        if(porcentaje > 0 && porcentaje < 101){
            System.out.println("Aplicando "+porcentaje+"% de descuento");
            total -= total*porcentaje/100;
        }
    }

    public void mostrarPedido(){
        System.out.println("Pedido:\n Pedido #:"+this.numeroPedido+"\nCliente:"+this.nombreCliente+"\ntota:"+this.total+"\nProdcutos:"+this.productos);
    }
}
