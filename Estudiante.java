package Herencia;

public class Estudiante extends PersonaAbs implements EstudianteTrabajador {
	private String Grado;
	
	public Estudiante(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	
	public Estudiante(String nombre, int edad, String grado) {
		super(nombre, edad);
		this.Grado = grado;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RealizarActividad() {
		// TODO Auto-generated method stub
		System.out.println("El alumno entrega su proyecto y recibe una calificación");
	}

	@Override
	public void Sueldo() {
		// TODO Auto-generated method stub
		System.out.println("Sueldo de becario");
	}
	
	@Override
	public String toString() {
		return super.getNombre() + " " + super.getEdad();
		
	}

}
