package cafeteira;

public class Nescafe extends MaquinaDeCafe{
	private double retensaoDeLiquido = 0.2;
	
	public Nescafe(Cafe cafe) {
		super(cafe);
	}

	@Override
	void fazerCafe(double litrosDeAgua) {
		double litrosDeCafeProduzido = (cafe.getDensidade() * litrosDeAgua) - retensaoDeLiquido;
		System.out.println("Nescafe: Produzi " + litrosDeCafeProduzido + " litros de café");
	}

}
