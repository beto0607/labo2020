package com.labo.p1.e1;

public class Estudiante {
	private String apellido;
	private String nombre;
	private String legajo;
	
	
	public Estudiante(String apellido, String nombre, String legajo) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.legajo = legajo;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Nombre y apellido: ");
		stringBuffer.append(this.nombre);
		stringBuffer.append(" ");
		stringBuffer.append(this.apellido);
		stringBuffer.append(" - Legajo: ");
		stringBuffer.append(this.legajo);
		return stringBuffer.toString();
	}
	
	
}
