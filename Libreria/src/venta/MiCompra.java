package venta;

import java.util.ArrayList;
import java.util.List;
import libros.Libros;
import usuario.Usuario;

public class MiCompra {
protected Integer precioTotal=0;
protected Usuario iniciadaPor;
protected List<Libros> miLibro= new ArrayList<Libros>();
protected Carrito enCarrito;
public MiCompra(){

}

public Usuario getIniciadaPor() {
	return iniciadaPor;
}
public void setIniciadaPor(Usuario iniciadaPor) {
	this.iniciadaPor = iniciadaPor;
}
public List<Libros> getMiLibro() {
	return miLibro;
}
public void setMiLibro(List<Libros> miLibro) {
	this.miLibro = miLibro;
}
public Carrito getEnCarrito() {
	return enCarrito;
}
public void setEnCarrito(Carrito enCarrito) {
	this.enCarrito = enCarrito;
}
public List<Libros> getAgregarLibro() {
	if (miLibro == null)
		this.miLibro = new ArrayList<Libros>();
	return miLibro;
}
public void setAgregarLibro(Libros agregarlibro) {
	this.getMiLibro().add(agregarlibro);
}
public Integer getPrecioTotal() {
	return precioTotal;
}
public void setPrecioTotal(Integer precioTotal) {
		this.precioTotal = precioTotal;
	}
	
public void sumarTotal(){
	for (Integer i=0; i<miLibro.size();i++){
	System.out.println(miLibro.get(i));
	precioTotal= precioTotal+miLibro.get(i).getPrecio();
}

}

public void agregarACarrito(Carrito enCarrito){
	setEnCarrito(enCarrito);
	}

public void comprarProducto(){
	for (Libros libros : miLibro) {
		libros.decrementarStock();
		libros.habilitarLic();
	}
}
}


