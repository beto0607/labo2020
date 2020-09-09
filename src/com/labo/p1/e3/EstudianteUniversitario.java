package com.labo.p1.e3;

import java.time.LocalDate;

import com.labo.p1.e1.Estudiante;

public class EstudianteUniversitario extends Estudiante {
	private LocalDate fechaIngreso;

	public EstudianteUniversitario(String apellido, String nombre, String legajo, LocalDate fechaIngreso) {
		super(apellido, nombre, legajo);
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
				" - Fecha de ingreso: " + this.fechaIngreso.toString();
	}

}
