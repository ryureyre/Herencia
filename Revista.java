package Herencia;

public class Revista extends Publicacion{
	private int Numero;
	
	public Revista(String codigo, String titulo, int año) {
		super(codigo, titulo, año);
		// TODO Auto-generated constructor stub
	}
	
	public Revista(String codigo, String titulo, int año, int numero) {
		super(codigo, titulo, año);
		// TODO Auto-generated constructor stub
		this.Numero = numero;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}
	
	public String toString() {
		return super.getCodigo() + " " + super.getTitulo() + " " + super.getAño() + " " + this.getNumero();
	}
	
	public String getCodigo() {
		return super.getCodigo();
	}
	
	public int getAño() {
		return super.getAño();
	}	
	
	
	
	

}
