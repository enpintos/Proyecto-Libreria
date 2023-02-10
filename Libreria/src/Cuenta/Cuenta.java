package Cuenta;


import usuario.Usuario;

public class Cuenta {
private Integer nCuenta;
private Integer saldo=0;
private Usuario titular;

public Cuenta(Integer ncuenta){
	this.nCuenta=ncuenta;
}
public Integer getnCuenta() {
	return nCuenta;
}
public void setnCuenta(Integer nCuenta) {
	this.nCuenta = nCuenta;
}


public Integer getSaldo() {
	return saldo;
}
public void setSaldo(Integer saldo) {
	this.saldo = saldo;
}
public Usuario getTitular() {
	return titular;
}
public void setTitular(Usuario titular) {
	this.titular = titular;
}
public void incrementarSaldo(Integer monto) {
	saldo = saldo +monto;
}
public void consultarSaldo(){
	System.out.println("Mi saldo es: "+getSaldo());
	
}

}
