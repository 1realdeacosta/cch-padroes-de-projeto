package design_patern_builder;

public class ComputerBuilder implements Builder {

	private Double memoriaRam;
	private Double discoRigido;
	private Integer portasUsb;
	private SaidaVideo saidaVideo;
	private Double potenciaFonte;
	private Processador processador;
	private PlacaVideo placaVideo;

	public Computer getConfiguracaoComputador() {
		return new Computer(processador, potenciaFonte, saidaVideo, portasUsb, discoRigido, memoriaRam, placaVideo);
	}

	@Override
	public void setPotenciaFonte(Double potenciaFonte) {
		this.potenciaFonte = potenciaFonte;
	}

	@Override
	public void setSaidaVideo(SaidaVideo saidaVideo) {
		this.saidaVideo = saidaVideo;
	}

	@Override
	public void setProcessador(Processador processador) {
		this.processador = processador;
	}

	@Override
	public void setPortasUsb(Integer portasUsb) {
		this.portasUsb = portasUsb;
	}

	@Override
	public void setDiscoRigido(Double discoRigido) {
		this.discoRigido = discoRigido;
	}

	@Override
	public void setMemoriaRam(Double memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	@Override
	public void setPlacaVideo(PlacaVideo placaVideo) {
		this.placaVideo = placaVideo;
	}

}
