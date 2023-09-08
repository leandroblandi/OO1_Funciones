package modelo;

/**
 * @author el3be
 *
 */
public class Numero {

	private int valor;

	public Numero(int valor) {
		this.setValor(valor);
	}

	public boolean esPrimo() {

		int cantidadDivisores = 0;
		int i = 1;

		while (i <= this.valor) {
			if (this.valor % i == 0)
				cantidadDivisores++;
			i++;
		}
		return cantidadDivisores == 2;
	}

	public boolean esPrimoMellizo() {

		if (this.esPrimo()) {
			Numero mellizoAnterior = new Numero(this.valor - 2);
			Numero mellizoProximo = new Numero(this.valor + 2);
			return mellizoAnterior.esPrimo() || mellizoProximo.esPrimo();
		}
		return false;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Numero [valor=" + valor + "]";
	}
}
