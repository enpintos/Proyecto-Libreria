package libros;

import java.util.Set;

import venta.MiCompra;

public abstract class Libros {
protected String titulo;
protected String autor;
protected Integer año;
protected String genero;
protected Integer precio;
protected Integer isbn;
protected MiCompra enCompra;
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public Integer getAnio() {
	return año;
}
public void setAnio(Integer anio) {
	this.año = anio;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public Integer getPrecio() {
	return precio;
}
public void setPrecio(Integer precio) {
	this.precio = precio;
}
public MiCompra getEnCompra() {
	return enCompra;
}
public void setEnCompra(MiCompra enCompra) {
	this.enCompra = enCompra;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Libros other = (Libros) obj;
	if (isbn == null) {
		if (other.isbn != null)
			return false;
	} else if (!isbn.equals(other.isbn))
		return false;
	return true;
}
public Integer getIsbn() {
	return isbn;
}
public void setIsbn(Integer isbn) {
	this.isbn = isbn;
}
public Set<Libros> add(Libros listadoLibros) {
	// TODO Auto-generated method stub
	return null;
}

public abstract void decrementarStock();

public abstract void aumentarStock();

public abstract void habilitarLic();
}

