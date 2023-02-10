package Gestores;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import usuario.Usuario;
public class GestorUsuarios {
	protected Set<Usuario> listaDeUsers =  new HashSet<Usuario>();
	
	public Set<Usuario> getListaDeUsers() {
		return listaDeUsers;
	}

		public Set<Usuario> getAgregarUser() {
		if (listaDeUsers == null)
			this.listaDeUsers = new HashSet<Usuario>();
		return listaDeUsers;
	}
	public void listarUser(Usuario agregarUser) {
		this.getListaDeUsers().add(agregarUser);
	}	
	
	public void listarProductos(){
		listaDeUsers=this.getListaDeUsers();
		for (Usuario usuario : listaDeUsers) {
			System.out.println(usuario.toString());
		}
	}
	
	
	public void login (){
		Iterator<Usuario> it=listaDeUsers.iterator();
		System.out.println("Ingrese Usuario");
		Scanner scu=new Scanner(System.in);
		String user = scu.next();
		System.out.println("Ingrese password");
		scu.nextLine();
		String pass = scu.next();
		scu.close();
		while (it.hasNext()){
			Usuario esteUser = it.next();
			String xuser = esteUser.getUsername();
			String xpass = esteUser.getPassword();
			it.remove();
			if (user.equals(xuser)&& pass.equals(xpass)){
				esteUser.setLoginOk(true);
				break;
				}else {System.out.println("Usuario o contraseña incorrecta");}
		}
	}
}