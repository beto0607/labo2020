package com.labo.p1.test;

import com.labo.p1.e3.EstudianteSecundario;
import static java.lang.System.out;

public class TestEstudianteSecundario {

	public static void main(String[] args) {
		EstudianteSecundario estudianteSecundario = 
				new EstudianteSecundario("apellido1", "nombre1","legajo1",3, 4.5f );

		out.println(estudianteSecundario.toString());
	}

}
