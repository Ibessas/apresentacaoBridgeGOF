package cafeteira;

public class TresCoracoes implements Cafe {
	private double densidade = 3.2;

	@Override
	public double getDensidade() {
		System.out.println("Cafe Tres Corações");
		return densidade;
	}

}
