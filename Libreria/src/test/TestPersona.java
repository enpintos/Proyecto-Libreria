package test;


import Cuenta.Cuenta;
import persona.Persona;
import usuario.Normal;
import usuario.Vip;

public class TestPersona {

	public static void main(String[] args) {
		
		
		Persona per1 = new Persona (30111222,"Juan", "Perez", "jperez@gmail.com", 112223333);
	
		Normal user1 = new Normal ("jperez1", "1234", per1);
		user1.setMiPersona(per1);
		
		Cuenta c1 = new Cuenta(1001);
		c1.setTitular(user1);
		user1.setMiCuenta(c1);
		
				
		System.out.println("Usuario 1: "+user1.getUsername());
		System.out.println("Pass: "+user1.getPassword());
		System.out.println("Pertenece a: "+user1.getMiPersona().formatoPersona());
		
		System.out.println("Cuenta N° "+c1.getnCuenta()+": "+c1.getSaldo());
		user1.getMiCuenta().incrementarSaldo(500);
		System.out.println("Cuenta N° "+user1.getMiCuenta().getnCuenta()+": "+user1.getMiCuenta().getSaldo());
		user1.getMiCuenta().incrementarSaldo(150);
		System.out.println("Cuenta N° "+user1.getMiCuenta().getnCuenta()+": "+user1.getMiCuenta().getSaldo());
		
		c1.consultarSaldo();
		
		user1.cambiarPass();
		
		System.out.println("Pass: "+user1.getPassword());
		
		Persona per2 = new Persona (30980130,"Ezequiel","Gonzalez","ezegon@gmail.com",115551000);
		
		Vip user2 = new Vip ("ez124","abcd",per2);
		user2.setMiPersona(per2);
		
		Cuenta c2 = new Cuenta(1002);
		c2.setTitular(user2);
		user2.setMiCuenta(c2);
		user2.getMiCuenta().incrementarSaldo(100);
		
		System.out.println("Usuario 2: "+user2.getUsername());
		System.out.println("Pass :"+user2.getPassword());
		System.out.println("Pertenece a: "+user2.getMiPersona().formatoPersona());
		c2.consultarSaldo();
			
	}
}
