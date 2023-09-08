package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Funciones;

public class TestFunciones {

	public static void main(String[] args) {

		// fechas para test
		LocalDate fecha = LocalDate.of(2023, 9, 4);
		LocalTime hora = LocalTime.of(22, 27);

		System.out.println(Funciones.esBisiesto(1996));

		System.out.println(Funciones.traerFechaCorta(fecha));
		System.out.println(Funciones.traerHoraCorta(hora));

		System.out.println(Funciones.esDiaHabil(fecha));
		System.out.println(Funciones.traerDiaDeLaSemana(fecha));

		System.out.println(Funciones.traerMesEnLetras(fecha));
		System.out.println(Funciones.traerFechaLarga(fecha));

		System.out.println(Funciones.aproximar2Decimal(2.506));
		System.out.println(Funciones.traerCantidadDiasMes(2023, 9));

		System.out.println(Funciones.esNumero('3'));
		System.out.println(Funciones.esLetra('l'));

		System.out.println(Funciones.esCadenaLetras("leandro blandi12"));
		System.out.println(Funciones.esCadenaNros("1234le"));
	}

}
