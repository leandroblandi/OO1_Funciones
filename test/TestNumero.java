package test;

import modelo.Numero;

public class TestNumero {

	public static void main(String[] args) {

		Numero n = new Numero(3);

		System.out.println(n.esPrimo());
		System.out.println(n.esPrimoMellizo());
		System.out.println(n);

	}

}
