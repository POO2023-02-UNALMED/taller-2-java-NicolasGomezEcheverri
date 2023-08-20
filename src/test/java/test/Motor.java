package test;

public class Motor {
	//atributos
	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	//metodos
	public void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	public void asignarTipo(String tipo) {
		String[] motores = {"electrico", "gasolina"};
		for (String motorValido : motores) {
			if (motorValido.equals(tipo)) {
				this.tipo = tipo;
				break;
			}
		}
	}
}
