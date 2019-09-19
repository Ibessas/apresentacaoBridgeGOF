package cafeteira;

public abstract class MaquinaDeCafe {
	Cafe cafe;
	
	 public MaquinaDeCafe(Cafe cafe) {
		 this.cafe = cafe;
	 }

	abstract void fazerCafe(double litrosDeAgua);
}
