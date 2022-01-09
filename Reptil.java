package Vídeo_25;

public class Reptil extends Animal {

	private String corescama;
	
	@Override
	public void Locomover() {
System.out.println("Rastejando!!!");		
	}

	@Override
	public void Alimentar() {
System.out.println("Comendo Vegetais");		
	}

	@Override
	public void EmitirSom() {
System.out.println("Som de Réptio!!!");		
	}

	
	//GETS E SETS

	
	public String getCorescama() {
		return corescama;
	}

	public void setCorescama(String corescama) {
		this.corescama = corescama;
	}
	
	
}
