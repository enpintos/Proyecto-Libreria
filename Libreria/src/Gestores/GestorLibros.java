package Gestores;

	import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import libros.Impreso;
import libros.Libros;

	public class GestorLibros {

		protected Set<Libros> listadoLibros =  new HashSet<Libros>();

		public Set<Libros> getListadoLibros() {
			return listadoLibros;
		}

			public Set<Libros> getAgregarLibro() {
			if (listadoLibros == null)
				this.listadoLibros = new HashSet<Libros>();
			return listadoLibros;
		}
		public void registrarLibro(Libros agregarlibro) {
			this.getListadoLibros().add(agregarlibro);
		}	
		
		public void listarProductos(){
			listadoLibros=this.getListadoLibros();
			for (Libros libros : listadoLibros) {
				System.out.println(libros.toString());
			}
		}
		
		public void agregarCant(){

			Iterator<Libros> it=listadoLibros.iterator();
			System.out.println("Ingrese ISBN");
			Scanner sc = new Scanner(System.in);
			Integer xisbn = sc.nextInt();
			sc.close();
			while (it.hasNext()){
				Libros esteLibro = it.next();
				Integer esteisbn = esteLibro.getIsbn();
				it.remove();

				if (esteisbn.equals(xisbn) && esteLibro instanceof Impreso) {
					esteLibro.aumentarStock();
					break;
					}
					}
					}
		public void buscarLibro(){

			Iterator<Libros> it=listadoLibros.iterator();
			System.out.println("Ingrese Título");
			Scanner sc = new Scanner(System.in);
			String xtit = sc.nextLine();
			
			sc.close();
			while (it.hasNext()){
				Libros esteLibro = it.next();
				String estetit = esteLibro.getTitulo();
				it.remove();
				if (estetit.equals (xtit)){
					esteLibro.toString();
				}
			}
		}
}

