package tallerOPP;

public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;
    private String tipoCuenta;


    public  CuentaBancaria(){

    }
    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        if(saldo >= 0) {
            this.saldo = saldo;
        }else{
            this.saldo = 0.0;
            System.out.println("Debe agregar un saldo positivo");
        }
        if(tipoCuenta == "Ahorros" || tipoCuenta == "Corriente") {
            this.tipoCuenta = tipoCuenta;
        }else{
            this.tipoCuenta = "";
            System.out.println("Tipo de cuenta invalida");
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double depositar(double monto){
        if(monto >0) {
            this.saldo += monto;
            System.out.println("Depositando...");
        }
        else {
            System.out.println("El monto debe ser positivo");
        }

        return  this.saldo;
    }

    public double retirar(double monto){
        if(this.saldo >= monto){
            this.saldo -= monto;
            System.out.println("Retirando...");
        }else{
            System.out.println("Fondos insuficientes");
        }
        return this.saldo;

    }

    public void mostrarDatos(){
        System.out.println("\n\nInformación de cuenta: \nNumero de cuenta: "+this.numeroCuenta +"\nTipo de cuenta: "+this.tipoCuenta+"\nSaldo: "+this.saldo+"\n");
    }
}
