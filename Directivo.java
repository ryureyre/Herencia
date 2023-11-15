package Herencia;

public class Directivo extends Trabajador {
	private String Categoria;
	
	public Directivo(String nombre, int edad, String puesto, String categoria) {
		super(nombre, edad, puesto);
		// TODO Auto-generated constructor stub
		this.Categoria = categoria;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	@Override
	public String toString() {
		return "Directivo [Categoria=" + Categoria + "]";
	}

	
}
