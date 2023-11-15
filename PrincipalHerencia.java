package Herencia;

import java.util.ArrayList;

public class PrincipalHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClasesAbstractas();
		//Publicaciones();	
		//Ejercicio6();
		PracticaExtra();
	}
	
	public static void PracticaExtra() {
		Trabajador empleado1 = new Trabajador("Luis", 28, "Desarrollador web", 15000, "Sukarne");
		empleado1.Mostrar();
	
	}
	
	public static void Ejercicio6() {
		Estudiante est1 = new Estudiante("Pancho", 18);
		Trabajador trab1 = new Trabajador("Pedro", 45, "Director");
		Estudiante et1 = new Estudiante("Rosita", 22);
		
		System.out.println("Estudiante sin trabajo: " + est1.toString());
		System.out.println("Trabajador: " + trab1.toString());
		System.out.println("Estudiante que trabaja y siempre tiene sueño: " + et1.toString());
		et1.Sueldo();
	}
	
	public static void ClasesAbstractas() {
		Coche coche1 = new Coche("Civic", "2013", 4);
		Moto moto1 = new Moto("Harley", "2023");
		
		System.out.println("***Coche 1*** ");
		coche1.MostrarDatos();
		
		coche1.Arrancar();
		coche1.Acelerar();
		coche1.Frenar();
		coche1.Apagar();
		
		System.out.println("***Moto 1*** ");
		moto1.MostrarDatos();
		
		moto1.Arrancar();
		moto1.Acelerar();
		moto1.Frenar();
		moto1.Apagar();
		
	}
	
	public static int cuentaPrestados(ArrayList<Libro> libros) {
		int countPrestados = 0;
		
		for(int i = 0; i < libros.size(); i++) {
			if(libros.get(i).isPrestado())
				countPrestados += 1;
		}
				return countPrestados;
	}	
	
	public static int publicacionesAnterioresA(ArrayList<Publicacion> publicaciones, int año) {
		int countPublicaciones = 0;
		
		for(int i = 0; i < publicaciones.size(); i++) {
			if(publicaciones.get(i).getAño() < año)
				countPublicaciones += 1;
		}
		
		return countPublicaciones;
	}
	
	public static void Publicaciones() {
		ArrayList<Publicacion> publicaciones= new ArrayList();
		ArrayList<Libro> libros= new ArrayList();
		
		Libro libro1 = new Libro("AF1458", "La sombra azul", 1958);
		Libro libro2 = new Libro("AG7845", "Java for all", 1995);
		Revista revista1 = new Revista("RE1001", "Treinta y más", 2020);
		Revista revista2 = new Revista("RE1002", "Tecnologías del mañana", 1989);
		libros.add(libro1);
		libros.add(libro2);
		publicaciones.add(libro1);
		publicaciones.add(libro2);
		publicaciones.add(revista1);
		publicaciones.add(revista2);
		
		if (!libro1.isPrestado())
			System.out.println("libro disponible");
		
		System.out.println("libro 1" + libro1.isPrestado());
		
		libro1.Prestar();
		
		System.out.println("libro 1" + libro1.isPrestado());
		
		libro1.Prestar();
		
		for(int i = 0; i < publicaciones.size(); i++) {
			System.out.println("Publicación: " + publicaciones.get(i).toString()); 
			//System.out.println("Publicación: " + publicaciones.get(i).getClass());
				
		}
		
		System.out.println("Hay " + cuentaPrestados(libros) + " libros prestados");
		System.out.println("Existen " + publicacionesAnterioresA(publicaciones, 1990) + " publicaciones que fueron publicadas antes de 1990");
		
	}
	
	
	
}
