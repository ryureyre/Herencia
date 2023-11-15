package Herencia;
import java.util.ArrayList;

public class Libro extends Publicacion implements Prestable {
	private boolean Prestado;
	
	public Libro(String codigo, String titulo, int año) {
		super(codigo,titulo, año);
		this.Prestado = false;
		// TODO Auto-generated constructor stub
	}

	public boolean isPrestado() {
		return this.Prestado;
	}

	public void setPrestado(boolean prestado) {
		this.Prestado = prestado;
	}
	
	public String toString() {
		return super.getCodigo() + " " + super.getTitulo() + " " + super.getAño();
	}
	
	public String getCodigo() {
		return super.getCodigo();
	}
	
	public int getAño() {
		return super.getAño();
	}

	@Override
	public void Prestar() {
		// TODO Auto-generated method stub
		if(Prestado()) 
		 System.out.println("Libro no disponible");
		else
			this.Prestado = true; 	
	}

	@Override
	public void Devolver() {
		// TODO Auto-generated method stub
		this.Prestado = false; 
	}

	@Override
	public boolean Prestado() {
		return Prestado;
		// TODO Auto-generated method stub
		
	}		
	
	

}
