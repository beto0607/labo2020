package com.labo.p1.test;

import static java.lang.System.out;
import com.labo.p1.e3.EstudiantePrimario;


public class TestEstudiantePrimario {

	public static void main(String[] args) {
		EstudiantePrimario estudiantePrimario = 
				new EstudiantePrimario("apellido1", "nombre1", "legajo1", 10, false);
		
		out.println(estudiantePrimario.toString());
	}

}
