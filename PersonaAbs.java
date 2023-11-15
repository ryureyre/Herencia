package Herencia;

public abstract class PersonaAbs {
 private String nombre;
 private int edad;
 private String genero;
 
 public PersonaAbs(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = ""; 
	}
 
 public PersonaAbs(String nombre, int edad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero; 
	}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public abstract void RealizarActividad();
 
public void Mostrar() {
	System.out.println("Nombre: " + this.getNombre() 
	                              + "\nEdad: " + this.getEdad());
}

}
