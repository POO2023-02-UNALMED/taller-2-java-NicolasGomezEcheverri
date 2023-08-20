package test;

public class Asiento {
	//atributos
	public String color;
	public int precio;
	public int registro;
	
	//metodos
	public void cambiarColor(String color) {
		String[] colores = {"rojor", "verde", "amarillo", "negro", "blanco"};
		for (String colorValido : colores) {
			if (colorValido.equals(color)) {
				this.color = color;
				break;
			}
		}
	}
}