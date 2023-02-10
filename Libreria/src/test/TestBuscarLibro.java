package test;

import java.util.Iterator;

import Gestores.GestorLibros;
import libros.Digital;
import libros.Impreso;
import libros.Libros;

public class TestBuscarLibro {

	public static void main(String[] args) {
		Impreso libro1 = new Impreso ("El Resplandor", "S.King", 1977, "Terror", 900, 102030,20);
		
		Impreso libro2 = new Impreso("Juego de Tronos", "G.Martin", 2001, "Novela", 1800,20000,15);
		
		Digital libro3 = new Digital("El Resplandor", "S.King", 1977, "Terror", 600, 102030, " buy4td28");
		
		GestorLibros g1 = new GestorLibros();
		g1.registrarLibro(libro1);
		g1.registrarLibro(libro2);
		g1.registrarLibro(libro3);
		
		Iterator<Libros> it = g1.getListadoLibros().iterator();
		while (it.hasNext()){
			Libros xlibro = it.next();
			String esteTit = xlibro.getTitulo();
			it.remove(); 
			if (esteTit.equals("El Resplandor")){		
				System.out.println(xlibro.toString());
				}
		}

	}

}
