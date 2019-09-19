package tv;

public abstract class Dispositivo {

	public int estadoDispositivo;
	
	public int configuracaoMaxima;
	
	public int volume = 0;
	
	public abstract void botaoCincoPressionado();
	public abstract void botaoSeisPressionado();
	
	public void dispositivoFeedback() {
		if(estadoDispositivo > configuracaoMaxima || estadoDispositivo < 0 ) {
			estadoDispositivo = 0;
			
			System.out.println("No " + estadoDispositivo);
		}
		
	}
	
	public void botaoSetePressionado() {
		volume++;
		System.out.println("Volume em " + volume);
	}

	public void botaoOitoPressionado() {
		volume--;
		System.out.println("Volume em " + volume);
	}
}
