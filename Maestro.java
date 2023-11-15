package Herencia;

import POO_2023.src.Persona;

public class Maestro extends Persona{
	private String clases;
	private String estacionamiento;
	
	public Maestro() {
		super();
	}
	public Maestro(String nombre, int edad, char genero, String intereses, String clases, String estacionamiento) {
		super(nombre, edad, genero, intereses);
		
	}
	
	
}
