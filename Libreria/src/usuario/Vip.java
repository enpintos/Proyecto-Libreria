package usuario;

import persona.Persona;

public class Vip extends Usuario {
	
	public Vip(String username, String password, Persona miPersona){
		this.username=username;
		this.password=password;
	}

	public void pagarCarrito (){
		Integer total = 0;
		for (Integer i=0; i<miLista.size();i++){
		total = total+miLista.get(i).getPrecioTotal();
		}
		total=total*80/100;
		System.out.println("Total con descuento: "+total);
		Integer saldo = 0;
		saldo = saldo+miCuenta.getSaldo(); 
		if (total <= saldo){
			saldo = saldo - total;
			System.out.println("Compra exitosa");
			this.miCarrito.setVentaOk(true);
			miCuenta.setSaldo(saldo);
			}
			else {
				System.out.println("No tiene suficiente saldo");
			}
	}

}
