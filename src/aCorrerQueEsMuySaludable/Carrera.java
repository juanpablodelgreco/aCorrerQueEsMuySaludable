package aCorrerQueEsMuySaludable;

import java.util.ArrayList;

public class Carrera {
	private int edadDesde;
	private int edadHasta;
	private String sexo;
	private ArrayList<Integer> ganadores = new ArrayList<Integer>();

	public Carrera(int edadDesde, int edadHasta, String sexo) {
		this.edadDesde = edadDesde;
		this.edadHasta = edadHasta;
		this.sexo = sexo;
	}

	public int getEdadDesde() {
		return edadDesde;
	}

	public void setEdadDesde(int edadDesde) {
		this.edadDesde = edadDesde;
	}

	public int getEdadHasta() {
		return edadHasta;
	}

	public void setEdadHasta(int edadHasta) {
		this.edadHasta = edadHasta;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public ArrayList<Integer> getGanadores() {
		return ganadores;
	}

	public void setGanadores(ArrayList<Integer> ganadores) {
		this.ganadores = ganadores;
	}
}
