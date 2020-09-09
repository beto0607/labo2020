package com.labo.p1.test;

import static java.lang.System.out;

import java.time.LocalDate;

import com.labo.p1.e3.EstudianteUniversitario;

public class TestEstudianteUniversitario {

	public static void main(String[] args) {
		EstudianteUniversitario estudianteUniversitario = 
				new EstudianteUniversitario("nombre1", "apellido1", "legajo1", LocalDate.parse("2020-03-01"));
		
		out.println(estudianteUniversitario.toString());
	}

}
