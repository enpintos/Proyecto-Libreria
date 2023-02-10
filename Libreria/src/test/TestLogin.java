package test;

import Gestores.GestorUsuarios;
import persona.Persona;
import usuario.Normal;
import usuario.Vip;

public class TestLogin {

	public static void main(String[] args) {
		Persona per1 = new Persona (30111222,"Juan", "Perez", "jperez@gmail.com", 112223333);
		
		Normal user1 = new Normal ("jperez1", "1234", per1);
		user1.setMiPersona(per1);
		Persona per2 = new Persona (30980130,"Ezequiel","Gonzalez","ezegon@gmail.com",115551000);
		
		Vip user2 = new Vip ("ez124","abcd",per2);
		user2.setMiPersona(per2);
		
		GestorUsuarios g1 = new GestorUsuarios();
		g1.listarUser(user2);
		g1.listarUser(user1);
		
		g1.login();
		
		System.out.println(user1.getUsername()+" Login: "+user1.getLoginOk()); 
		System.out.println(user2.getUsername()+" Login: "+user2.getLoginOk());

	}

}
