package Libros;

public class Libro {
	private String titulo;
	private String autor;
	private int nroPaginas;
	public Libro(String titulo, String autor, int nroPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nroPaginas = nroPaginas;
	}
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
	public int getNroPaginas() {
		return nroPaginas;
	}
	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", nroPaginas=" + nroPaginas + "]";
	}
	
	public void leer() {
		titulo=Leer.dato();
		autor=Leer.dato();
		nroPaginas=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
