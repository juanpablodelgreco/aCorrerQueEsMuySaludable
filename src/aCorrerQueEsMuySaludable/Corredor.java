package aCorrerQueEsMuySaludable;

public class Corredor {
	private int edad;
	private String sexo;
	private int nroTorneo;

	public Corredor(int edad, String sexo) {
		this.edad = edad;
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getNroTorneo() {
		return nroTorneo;
	}

	public void setNroTorneo(int nroTorneo) {
		this.nroTorneo = nroTorneo;
	}

}
