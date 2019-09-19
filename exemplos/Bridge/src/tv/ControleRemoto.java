package tv;

public abstract class ControleRemoto {
	
	private Dispositivo dispositivo;

	public ControleRemoto(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public void botaoCincoPressionado() {
		dispositivo.botaoCincoPressionado();
	}
	
	public void botaoSeisPressionado() {
		dispositivo.botaoSeisPressionado();
	}
	
	public void deviceFeedback() {
		dispositivo.dispositivoFeedback();
	}
	
	public abstract void botaoNovePressionado();
	
	
	
}
