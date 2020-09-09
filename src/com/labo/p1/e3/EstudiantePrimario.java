package com.labo.p1.e3;

import com.labo.p1.Estudiante;

public class EstudiantePrimario extends Estudiante {
	private int ausencias;
	private boolean esRepetidor;
	

	public EstudiantePrimario(String nombre, String apellido, String legajo, int ausencias, boolean esRepetidor) {
		super();
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setLegajo(legajo);
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
