package test;

import libros.Impreso;
import persona.Persona;
import usuario.Normal;
import venta.Carrito;
import venta.MiCompra;
import Cuenta.Cuenta;

public class TestCompraPocoSaldo {

	public static void main(String[] args) {

		Persona per1 = new Persona (30111222,"Juan", "Perez", "jperez@gmail.com", 112223333);
		
		Normal user1 = new Normal ("jperez1", "1234", per1);
		user1.setMiPersona(per1);
		
		
		
		Cuenta c1 = new Cuenta(0001);
		c1.setTitular(user1);
		c1.incrementarSaldo(1000);
		
		Impreso libro1 = new Impreso("El Resplandor", "S.King", 1977, "Terror", 900,100000,10);
		Impreso libro2 = new Impreso("Juego de Tronos", "G.Martin", 1996, "Fantasía", 1800,20000,5) ;
		
			
		MiCompra compra1 = new MiCompra();
		compra1.setIniciadaPor(user1);
		compra1.setAgregarLibro(libro1);
		compra1.setAgregarLibro(libro2);
		libro1.setEnCompra(compra1);
		libro2.setEnCompra(compra1);
		
			
		Carrito car1 = new Carrito();
		car1.setListaProductos(compra1);
		car1.setComprador(user1);
		user1.setMiCarrito(car1);
		user1.setAgregarLista(compra1);
		user1.setMiCuenta(c1);
		compra1.agregarACarrito(car1);

		System.out.println("Stock antes de la venta: "+libro1.getCantidad());
		System.out.println("Stock antes de la venta: "+libro2.getCantidad());	
		System.out.println(compra1.getIniciadaPor().formato1user());
		System.out.println(user1.getMiPersona().formatoPersona());
		compra1.sumarTotal();
		System.out.println("Total lista :"+compra1.getPrecioTotal());
		car1.totalCompra();
		System.out.println("Total compra: "+car1.getTotalCompra());
		car1.realizarPedido();
		car1.colocarFecha();
		System.out.println("Fecha de compra: "+car1.getFechaCompra());
		user1.getMiCuenta().consultarSaldo();
		System.out.println("Stock postventa: "+libro1.getCantidad());
		System.out.println("Stock postventa: "+libro2.getCantidad());
		} 
	}

