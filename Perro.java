package Herencia;

import Polimorfismo.Mascota;

public class Perro extends Mamifero implements Mascota{
    private String raza;
  
    public Perro(String nombre, String tipo_alimentacion, int edad, int gestacion, String raza) {
        super(nombre, tipo_alimentacion, edad, gestacion);
        this.raza = raza;
    }
    public String getRaza() {
        return this.raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String toString() {
        
        return super.toString() + ", " + this.raza;
    }
	@Override
	public void Jugar() {
		// TODO Auto-generated method stub
		System.out.println("El perro juega con su hueso");
		
	}
	
	@Override
	public void Vacunar() {
		// TODO Auto-generated method stub
		System.out.println("Recibio su vacuna contra la rabia");
	}
	
	@Override
	public void Sonido() {
		// TODO Auto-generated method stub
		System.out.println("El perro ladra...");
	}
	
	
	
	
}