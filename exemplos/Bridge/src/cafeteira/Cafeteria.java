package cafeteira;

public class Cafeteria {

	public static void main(String[] args) {
		MaquinaDeCafe m1 = new Britania(new Marata());
		MaquinaDeCafe m2 = new Nescafe(new Marata());
		MaquinaDeCafe m3 = new Britania(new TresCoracoes());
		MaquinaDeCafe m4 = new Nescafe(new TresCoracoes());
		
		m1.fazerCafe(4);
		m2.fazerCafe(4);
		m3.fazerCafe(4);
		m4.fazerCafe(4);
	}

}
