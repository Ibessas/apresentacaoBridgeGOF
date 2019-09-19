package simple;

public abstract class Letra {
	Numero numero;

	public Letra(Numero numero) {
		this.numero = numero;
	}
	
	abstract void letraNumero();
}
