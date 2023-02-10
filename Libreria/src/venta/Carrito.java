package venta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import usuario.Usuario;

public class Carrito {
protected Date fechaCompra;
private Integer totalCompra=0;
private Boolean ventaOk = false;
protected Usuario comprador;
protected List<MiCompra> listaProductos= new ArrayList<MiCompra>();




public Integer getTotalCompra() {
	return totalCompra;
}
public void setTotalCompra(Integer totalCompra) {
	this.totalCompra = totalCompra;
}
public Date getFechaCompra() {
	return fechaCompra;
}
public void setFechaCompra(Date fechaCompra) {
	this.fechaCompra = fechaCompra;
}
public Usuario getComprador() {
	return comprador;
}
public void setComprador(Usuario comprador) {
	this.comprador = comprador;
}
public MiCompra getListaProductos() {
	return (MiCompra) listaProductos;
}


public void setListaProductos(MiCompra listaProductos) {
	this.listaProductos.add(listaProductos);
}



public Boolean getVentaOk() {
	return ventaOk;
}
public void setVentaOk(Boolean ventaOk) {
	this.ventaOk = ventaOk;
}
public void totalCompra(){
	for(Integer i=0; i<listaProductos.size();i++){
		totalCompra = totalCompra+listaProductos.get(i).getPrecioTotal();
	}
}

public void quitarLista(MiCompra listaProductos){
	listaProductos.miLibro.clear();
	this.listaProductos.remove(listaProductos);
	
}
public void colocarFecha(){
	if (ventaOk==true){
		Date fechaActual = new Date();
		this.fechaCompra = fechaActual;
	}
}
public void seguirComprando(){
	comprador.getMiLista();
}

public void realizarPedido(){
	this.comprador.pagarCarrito();
	if (ventaOk==true){
	for(MiCompra miCompra : listaProductos) {
		miCompra.comprarProducto();
	}
	}
}
}	




