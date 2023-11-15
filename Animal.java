package Herencia;

public class Animal {
	protected String Nombre; 
	protected String TipoAlimentación;
	protected int Edad;
	
	public Animal(String nombre, String tipoAlim, int edad ) {
		this.Nombre = nombre;
		this.TipoAlimentación = tipoAlim;
		this.Edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipoAlimentación() {
		return TipoAlimentación;
	}

	public void setTipoAlimentación(String tipoAlimentación) {
		TipoAlimentación = tipoAlimentación;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}
	
	
	
	
}
