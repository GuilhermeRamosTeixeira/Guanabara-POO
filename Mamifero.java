package Vídeo_25;

public class Mamifero extends Animal {

	private String corpelo;
	
	
	
	//GETS E SETS 

	@Override
	public void Locomover() {
System.out.println("Correndo!!!");		
	}

	@Override
	public void Alimentar() {
System.out.println("Mamando!!!");		
	}

	@Override
	public void EmitirSom() {
System.out.println("Emitindo Som de Mamifero");		
	}

	public String getCorpelo() {
		return corpelo;
	}

	public void setCorpelo(String corpelo) {
		this.corpelo = corpelo;
	}
	
	
}
