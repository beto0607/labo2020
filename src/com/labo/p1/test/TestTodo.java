package com.labo.p1.test;

import static java.lang.System.out;

public class TestTodo {

	public static void main(String[] args) {
		out.println("Estudiante primario: ");
		TestEstudiantePrimario.main(args);
		out.println("------");

		out.println("Estudiante secundario: ");
		TestEstudianteSecundario.main(args);
		out.println("------");

		out.println("Estudiante universitario: ");
		TestEstudianteUniversitario.main(args);
		out.println("------");
	}

}
