package simple;

public class A extends Letra{

	public A(Numero numero) {
		super(numero);
	}

	@Override
	void letraNumero() {
		System.out.println("A"+numero.getNumero());
	}

}
