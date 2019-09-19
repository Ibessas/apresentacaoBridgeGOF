package tv;

public class TV extends Dispositivo{

	public TV(int novoEstadoDispositivo, int novaCofiguracaoMaxima) {
		estadoDispositivo = novoEstadoDispositivo;
		configuracaoMaxima = novaCofiguracaoMaxima;
	}
	
	@Override
	public void botaoCincoPressionado() {
		System.out.println("Canal para baixo");
		estadoDispositivo--;
	}

	@Override
	public void botaoSeisPressionado() {
		System.out.println("Canal para cima");
		estadoDispositivo++;
	}

}
