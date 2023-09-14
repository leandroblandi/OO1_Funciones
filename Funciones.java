package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author el3be
 */
public class Funciones {

	/**
	 * @param anio
	 * @return Retorna true si el año es bisiesto, y falso si no lo es
	 */
	public static boolean esBisiesto(int anio) {
		return (anio % 4 == 0) && (!(anio % 100 == 0) || (anio % 400 == 0));
	}

	public static int traerDia(LocalDate fecha) {
		return fecha.getDayOfMonth();
	}

	/**
	 * @param fecha
	 * @return El numero de día en relación a la semana (1-7)
	 */
	public static int traerDiaSemana(LocalDate fecha) {
		return fecha.getDayOfWeek().getValue();
	}

	public static int traerMes(LocalDate fecha) {
		return fecha.getMonthValue();
	}

	public static int traerAnio(LocalDate fecha) {
		return fecha.getYear();
	}

	public static int traerHora(LocalTime hora) {
		return hora.getHour();
	}

	public static int traerMinuto(LocalTime hora) {
		return hora.getMinute();
	}

	public static String traerFechaCorta(LocalDate fecha) {
		return String.format("%d/%d/%d", traerDia(fecha), traerMes(fecha), traerAnio(fecha));
	}

	public static String traerHoraCorta(LocalTime hora) {
		return String.format("%d:%d", traerHora(hora), traerMinuto(hora));
	}

	public static boolean esDiaHabil(LocalDate fecha) {

		int diaSemana = traerDiaSemana(fecha);
		return (diaSemana >= 1) && (diaSemana <= 5);
	}

	public static String traerDiaDeLaSemana(LocalDate fecha) {
		String[] diasDeLaSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		int numeroDiaSemana = traerDiaSemana(fecha);
		return diasDeLaSemana[numeroDiaSemana - 1];
	}

	// Metodo para saber si una fecha esta entre dos fechas (extremos incluidos)
	public boolean entreFechas(LocalDate fecha, LocalDate desde, LocalDate hasta) {
		return (fecha.equals(desde)) || ((fecha.isAfter(desde)) && (fecha.isBefore(hasta))) || (fecha.equals(hasta));
	}

	public static String traerMesEnLetras(LocalDate fecha) {
		String mes = "";
		switch (traerMes(fecha)) {
		case 1 -> mes = "Enero";
		case 2 -> mes = "Febrero";
		case 3 -> mes = "Marzo";
		case 4 -> mes = "Abril";
		case 5 -> mes = "Mayo";
		case 6 -> mes = "Junio";
		case 7 -> mes = "Julio";
		case 8 -> mes = "Agosto";
		case 9 -> mes = "Septiembre";
		case 10 -> mes = "Octubre";
		case 11 -> mes = "Noviembre";
		case 12 -> mes = "Diciembre";
		}
		return mes;
	}

	public static String traerFechaLarga(LocalDate fecha) {
		return String.format("%s %d de %s de %d", traerDiaDeLaSemana(fecha), traerDia(fecha), traerMesEnLetras(fecha),
				traerAnio(fecha));
	}

	public static int traerCantidadDiasMes(int anio, int mes) {

		int cantidadDias = 0;

		if ((esBisiesto(anio)) && (mes == 2)) {
			cantidadDias = 29;
		} else if (mes == 2) {
			cantidadDias = 28;
		} else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
			cantidadDias = 30;
		} else {
			cantidadDias = 31;
		}
		return cantidadDias;
	}

	public static double aproximar2Decimal(double valor) {
		return ((double) Math.round(valor * 100)) / 100;
	}

	public static boolean esNumero(char c) {
		return Character.isDigit(c);
	}

	public static boolean esLetra(char c) {
		return Character.isLetter(c);
	}

	public static boolean esCadenaNros(String cadena) {
		boolean tieneLetras = false;
		int i = 0;

		while ((i < cadena.length()) && (!tieneLetras)) {
			if (esLetra(cadena.charAt(i))) {
				tieneLetras = true;
			}
			i++;
		}
		// retornamos lo contrario ya que si tiene letras
		// no es una cadena numerica
		return !tieneLetras;
	}

	public static boolean esCadenaLetras(String cadena) {
		boolean tieneNumeros = false;
		int i = 0;

		while ((i < cadena.length()) && (!tieneNumeros)) {
			if (esNumero(cadena.charAt(i))) {
				tieneNumeros = true;
			}
			i++;
		}
		// retornamos lo contrario porque si tiene numeros
		// no es una cadena de letras
		return !tieneNumeros;
	}

}
