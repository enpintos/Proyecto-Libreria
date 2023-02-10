package usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Cuenta.Cuenta;
import persona.Persona;
import venta.Carrito;
import venta.MiCompra;

public abstract class Usuario {
protected String username;
protected String password;
protected Persona miPersona;
protected Cuenta miCuenta;
protected Carrito miCarrito;
protected List<MiCompra> miLista = new ArrayList<MiCompra>();
protected Boolean loginOk=false;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Persona getMiPersona() {
	return miPersona;
}
public void setMiPersona(Persona miPersona) {
	this.miPersona = miPersona;
}
public Cuenta getMiCuenta() {
	return miCuenta;
}
public void setMiCuenta(Cuenta miCuenta) {
	this.miCuenta = miCuenta;
}
public Carrito getMiCarrito() {
	return miCarrito;
}
public void setMiCarrito(Carrito miCarrito) {
	this.miCarrito = miCarrito;
}
public List<MiCompra> getMiLista() {
	return miLista;
}

public void setMiLista(List<MiCompra> miLista) {
	this.miLista = miLista;
}

public List<MiCompra> getAgregarLista(){
	if (miLista == null)
		this.miLista = new ArrayList<MiCompra>();
	return miLista;
}

public void setAgregarLista(MiCompra agregarlista) {
	this.getMiLista().add(agregarlista);
}


public Boolean getLoginOk() {
	return loginOk;
}
public void setLoginOk(Boolean loginOk) {
	this.loginOk = loginOk;
}
public String formato1user(){
	return this.getUsername()+ " "; }



public void pagarCarrito (){
	Integer total = 0;
	Integer saldo = 0;
	for(Integer i=0;i>miLista.size();i++)
	total =	total+miLista.get(i).getPrecioTotal();
	saldo = saldo+miCuenta.getSaldo(); 
	System.out.println("Total en carrito: "+total);
	System.out.println("Saldo: "+saldo);
	if (total <= saldo){
		saldo = saldo - total;
		this.miCarrito.setVentaOk(true);
	System.out.println("Compra exitosa");
	}
	else{
		System.out.println("No tiene suficiente saldo");
	}
}

public void cambiarPass(){
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Ingrese nuevo password: ");
	String nuevoPass = sc1.next();
		this.password = nuevoPass;
		System.out.println("Cambio de password exitoso!!!");
		sc1.close();
	}



}








