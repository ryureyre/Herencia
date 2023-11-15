package Herencia;

import Polimorfismo.Mascota;

public class Gato extends Mamifero implements Mascota {
	private String Pedigre; 
	
	public Gato(String nombre, String tipo_alimentacion, int edad, int gestacion, String pedigre) {
        super(nombre, tipo_alimentacion, edad, gestacion);      
        this.Pedigre = pedigre;        
    }
	
	public String ToString()
	{
		return super.Nombre + " " + super.TipoAlimentación + " " + super.Edad + " " + this.Pedigre ;
	}

	@Override
	public void Jugar() {
		// TODO Auto-generated method stub
		System.out.println("El gato juega con el estambre de la abuela.");
	}

	@Override
	public void Vacunar() {
		// TODO Auto-generated method stub
		System.out.println("Recibio su vacuna contra la rabia");
	}
}
