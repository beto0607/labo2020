package com.labo.p1.e3;

import com.labo.p1.e1.Estudiante;

public class EstudiantePrimario extends Estudiante {
	private int ausencias;
	private boolean esRepetidor;
	

	public EstudiantePrimario(String apellido, String nombre, String legajo, int ausencias, boolean esRepetidor) {
		super(apellido, nombre, legajo);
		this.ausencias = ausencias;
		this.esRepetidor = esRepetidor;
	}
	public int getAusencias() {
		return ausencias;
	}
	public void setAusencias(int ausencias) {
		this.ausencias = ausencias;
	}
	public boolean isEsRepetidor() {
		return esRepetidor;
	}
	public void setEsRepetidor(boolean esRepetidor) {
		this.esRepetidor = esRepetidor;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				" - Ausencias: " + this.ausencias +
				" - ¿Es repetidor?: " + (this.esRepetidor ? "Sí" : "No");
	}
}
