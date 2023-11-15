package Herencia;

public abstract class FiguraGeometrica {
	  
	protected String Color;
	protected String Nombre = "";

	public FiguraGeometrica(){
	    this.Color = "";
	    this.Nombre = "";
	}
	public FiguraGeometrica(String color, String nombre){
	    this.Color = color;
	    this.Nombre = nombre;
	}
	public abstract float CalcularArea(float medida1, float medida2);


	public String getColor() {
	    return Color;
	}
	public void setColor(String color) {
	    Color = color;
	}
	public String getNombre() {
	    return Nombre;
	}
	public void setNombre(String nombre) {
	    Nombre = nombre;
	}

}
