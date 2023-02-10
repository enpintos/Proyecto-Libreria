package libros;

public class Digital extends Libros {

	private String licencia;
	public Digital(String titulo, String autor, Integer anio, String genero, Integer precio, Integer isbn, String licencia) {
		this.titulo=titulo;
		this.autor=autor;
		this.año=anio;
		this.genero=genero;
		this.precio=precio;
		this.isbn=isbn;
		this.licencia=licencia;		
		
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public String toString() {
		return "Digital [titulo=" + titulo + ", autor=" + autor + ", año="
				+ año + ", genero=" + genero + ", precio=" + precio
				+" ISBN=" + isbn +  "]";
	}

	@Override
	public void decrementarStock() {
				
	}
	@Override
	public void aumentarStock() {
				
	}
	@Override
	public void habilitarLic(){
		System.out.println("La licencia de su libro digital es: "+getLicencia());
	}
}
