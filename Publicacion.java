package Herencia;

public abstract class Publicacion {
 private String Codigo;
 private String Titulo;
 private int Año;
  
public Publicacion(String codigo, String titulo, int año) {
	Codigo = codigo;
	Titulo = titulo;
	Año = año;
}

public String getCodigo() {
	return Codigo;
}

public void setCodigo(String codigo) {
	Codigo = codigo;
}

public String getTitulo() {
	return Titulo;
}

public void setTitulo(String titulo) {
	Titulo = titulo;
}

public int getAño() {
	return Año;
}

public void setAño(int año) {
	Año = año;
}

 
}
