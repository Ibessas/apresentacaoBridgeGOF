package tv;

public class MutarControleTv extends ControleRemoto{

	public MutarControleTv(Dispositivo dispositivo) {
		super(dispositivo);
	}

	@Override
	public void botaoNovePressionado() {
		System.out.println("A tv esta muda");
	}

}
