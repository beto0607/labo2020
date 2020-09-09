package com.labo.p1.test;

import static java.lang.System.out;

import com.labo.p1.e1.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// Crear array
		Estudiante[] estudiantes = new Estudiante[5];
		// Inicializar los estudiantes
		for ( int i = 0; i<5; i++) {
			estudiantes[i] = new Estudiante();
			estudiantes[i].setApellido("apellido" + i);
			estudiantes[i].setNombre("nombre" + i);
			estudiantes[i].setLegajo("legajo" + i);
		}
		// Recorrer e imprimir
		for ( int i = 0; i<5; i++) {
			out.println(estudiantes[i].toString());
		}
		
		
	}

}
