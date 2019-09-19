package tv;

public class PausarControleTv extends ControleRemoto{

	public PausarControleTv(Dispositivo dispositivo) {
		super(dispositivo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void botaoNovePressionado() {
		System.out.println("A tv foi pausada");
	}

}
