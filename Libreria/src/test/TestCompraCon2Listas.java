package test;
import libros.Digital;
import libros.Impreso;
import persona.Persona;
import usuario.Vip;
import venta.Carrito;
import venta.MiCompra;
import Cuenta.Cuenta;

public class TestCompraCon2Listas {

			public static void main(String[] args) {
			
				Persona per1 = new Persona (30111222,"Juan", "Perez", "jperez@gmail.com", 112223333);
				
				Vip user1 = new Vip ("jperez1", "1234", per1);
				user1.setMiPersona(per1);
				
						
				Cuenta c1 = new Cuenta(0001);
				c1.setTitular(user1);
				c1.incrementarSaldo(6000);
				
				Impreso libro1 = new Impreso("El Resplandor", "S.King", 1977, "Terror", 900,102030,15);
				Digital libro2 = new Digital("Juego de Tronos", "G.Martin", 1996, "Fantasía", 1800,20000,"ax4vdcxir8bgt") ;
				Impreso libro3 = new Impreso("Juego de Tronos", "G.Martin", 1996, "Fantasía", 2500,20000,50);
				
				MiCompra compra1 = new MiCompra();
				compra1.setIniciadaPor(user1);
				compra1.setAgregarLibro(libro1);
				compra1.setAgregarLibro(libro2);
				MiCompra compra2 = new MiCompra();
				compra2.setIniciadaPor(user1);
				compra2.setAgregarLibro(libro3);
				compra2.setAgregarLibro(libro1);
				libro1.setEnCompra(compra1);
				libro2.setEnCompra(compra1);
				libro3.setEnCompra(compra2);
				libro1.setEnCompra(compra2);
						
				Carrito car1 = new Carrito();
				car1.setListaProductos(compra1);
				car1.setListaProductos(compra2);
				car1.setComprador(user1);
				user1.setMiCarrito(car1);
				user1.setAgregarLista(compra1);
				user1.setAgregarLista(compra2);
				user1.setMiCuenta(c1);
				compra1.setEnCarrito(car1);
				compra2.setEnCarrito(car1);


				System.out.println("Stock antes de la venta: "+libro1.getTitulo()+" "+libro1.getCantidad());
				System.out.println("Stock antes de la venta: "+libro3.getTitulo()+" "+libro3.getCantidad());

				
				System.out.println(compra1.getIniciadaPor().formato1user());
				System.out.println(user1.getMiPersona().formatoPersona());
				user1.getMiCuenta().consultarSaldo();
				compra1.sumarTotal();
				compra2.sumarTotal();
				System.out.println("Total de lista :"+compra1.getPrecioTotal());
				System.out.println("Total de lista :"+compra2.getPrecioTotal());
				car1.totalCompra();
				System.out.println("Total compra: "+car1.getTotalCompra());
				car1.realizarPedido();
				user1.getMiCuenta().consultarSaldo();
				System.out.println("Stock postventa: "+libro1.getTitulo()+" "+libro1.getCantidad());
				System.out.println("Stock postventa: "+libro3.getTitulo()+" "+libro3.getCantidad());
				} 
				
		

	}


