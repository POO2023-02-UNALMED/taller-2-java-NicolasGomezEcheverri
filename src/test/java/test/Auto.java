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
		int cntasientos = 0; 
		for (Asiento asiento_o : asientos) {
			if (asiento_o instanceof Asiento) {
				cntasientos++;
			}
		}
		return cntasientos;
	}
	public String verificarIntegridad() {
		for (Asiento asiento_i : asientos) {
			if (asiento_i instanceof Asiento) {
				if (asiento_i.registro != registro) {
					return "Las piezas no son originales";
				}
			}
		}
	 if (motor.registro != registro) {
		return "Las piezas no son originales";
		}
	 return "Auto original";
	}
}
	