package tallerOPP;

public class Main {
    public static void main(String[] args) {
    /*CuentaBancaria cuentaVacia = new CuentaBancaria();
    cuentaVacia.setNombreTitular("Frank");
    cuentaVacia.setNumeroCuenta("123456");
    cuentaVacia.setTipoCuenta("Ahorros");
    cuentaVacia.setSaldo(350000.0);

    CuentaBancaria cuentaParametros = new CuentaBancaria("09876","Nadie",-1.0,"otra");

    cuentaVacia.depositar(20000);
    cuentaVacia.depositar(-1);
    System.out.println(cuentaVacia.getSaldo());
    cuentaVacia.retirar(5000);
    cuentaVacia.retirar(400000);
    cuentaVacia.mostrarDatos();

    cuentaParametros.depositar(0.0);
    cuentaParametros.depositar(-1);
    cuentaParametros.depositar(500000);
    cuentaParametros.retirar(400000);
    cuentaParametros.mostrarDatos();*/

    /*Libro libro1 = new Libro("Cien años de soledad","Gabriel García Márquez",1967,true);
    libro1.prestar();
    libro1.prestar();
    libro1.devolver();
    libro1.devolver();
    libro1.mostrarDetalles();*/

        /*Auto auto1 = new Auto();
        auto1.setMarca("Chevrolet");
        auto1.setModelo("2029");
        auto1.setAnio(2029);

        auto1.actualizarKilometraje(1500);
        auto1.mostrarInformacion();
        auto1.actualizarKilometraje(500);
        auto1.actualizarKilometraje(-1);

        auto1.setDetallado(true);
        auto1.mostrarInformacion();*/

        Pedido pedido1 = new Pedido();
        pedido1.agregarProducto("panela",7500);
        pedido1.agregarProducto("arroz",3100);
        pedido1.agregarProducto("aceite",8990);
        pedido1.mostrarPedido();


    }
}