package com.labo.p1.e3;


import com.labo.p1.e1.Estudiante;

public class EstudianteSecundario extends Estudiante {
	private int materiasPrevias;
	private float promedioActual;
	
	
	public EstudianteSecundario(String nombre, String apellido, String legajo,  int materiasPrevias, float promedioActual) {
		super();
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setLegajo(legajo);
		this.materiasPrevias = materiasPrevias;
		this.promedioActual = promedioActual;
	}
	public int getMateriasPrevias() {
		return materiasPrevias;
	}
	public void setMateriasPrevias(int materiasPrevias) {
		this.materiasPrevias = materiasPrevias;
	}
	public float getPromedioActual() {
		return promedioActual;
	}
	public void setPromedioActual(float promedioActual) {
		this.promedioActual = promedioActual;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + 
				" - Previas: " + this.materiasPrevias + 
				" - Promedio: " + this.promedioActual;
	}
	
}
