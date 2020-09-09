package com.labo.p1.e3;

import java.time.LocalDate;

import com.labo.p1.e1.Estudiante;

public class EstudianteUniversitario extends Estudiante {
	private LocalDate fechaIngreso;

	public EstudianteUniversitario(String nombre, String apellido, String legajo, LocalDate fechaIngreso) {
		super();
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setLegajo(legajo);
		this.fechaIngreso = fechaIngreso;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				" - " + this.fechaIngreso.toString();
	}

}
