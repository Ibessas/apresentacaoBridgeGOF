package cafeteira;

public class Marata implements Cafe {
	private double densidade = 1.2;

	@Override
	public double getDensidade() {
		System.out.println("Cafe Marata");
		return densidade;
	}

}
