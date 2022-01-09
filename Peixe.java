package Vídeo_25;

public class Peixe extends Animal {

	
	private String corescama;
	
	public void FazerBolhas() {
		
		System.out.println("Soltou uma bolha!!!");
		
	}

	
	
	@Override
	public void Locomover() {
System.out.println("Nadando!!!!");		
	}



	@Override
	public void Alimentar() {
System.out.println("Comendo Substrancias!!!");		
	}



	@Override
	public void EmitirSom() {
System.out.println("Peixe não emite som!!!");		
	}



	public String getCorescama() {
		return corescama;
	}

	public void setCorescama(String corescama) {
		this.corescama = corescama;
	}
	
	
}
