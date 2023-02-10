package libros;

import java.util.Scanner;

public class Impreso extends Libros {
	
	private Integer cantidad;
	

	public Impreso(String titulo, String autor, Integer anio, String genero, Integer precio, Integer isbn, Integer cantidad) {
		this.titulo=titulo;
		this.autor=autor;
		this.año=anio;
		this.genero=genero;
		this.precio=precio;
		this.isbn=isbn; 
		this.cantidad=cantidad;
	}


	public Integer getCantidad() {
		return cantidad;
	}



	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "Impreso [titulo=" + titulo + ", autor=" + autor + ", año="
				+ año + ", genero=" + genero + ", precio=" + precio
				+" ISBN=" + isbn +  "]";
	}

	@Override
	public void decrementarStock() {
		cantidad = cantidad-1;
		}
	@Override
	public void aumentarStock(){
		System.out.println("Ingresar stock: ");
		Scanner sc1 = new Scanner(System.in);
		cantidad = cantidad+sc1.nextInt();
		sc1.nextLine();
		sc1.close();
				}
	@Override
	public void habilitarLic(){
		
	}
}