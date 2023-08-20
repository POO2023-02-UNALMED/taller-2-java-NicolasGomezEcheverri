package test;

public class Auto {
	//atributos
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	//metodos
	public int cantidadAsientos() {
		return asientos.length;
	}
	public String verificarIntegridad() {
		for (Asiento asiento_i : asientos) {
			if (asiento_i.registro != registro) {
				return "Las piezas no son originales";
			}
		}
	 if (motor.registro != registro) {
		return "Las piezas no son originales";
		}
	 return "Auto original";
	}
}
	