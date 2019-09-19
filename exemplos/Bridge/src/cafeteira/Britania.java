package cafeteira;

public class Britania extends MaquinaDeCafe{
	private double retensaoDeLiquido = 0.5;

	
	public Britania(Cafe cafe) {
		super(cafe);
	}

	
	@Override
	void fazerCafe(double litrosDeAgua) {
		double litrosDeCafeProduzido = (cafe.getDensidade() * litrosDeAgua) - retensaoDeLiquido;
		System.out.println("Britania: Produzi " + litrosDeCafeProduzido + " litros de café");
	}



}
