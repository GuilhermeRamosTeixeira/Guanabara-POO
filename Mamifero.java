package Vídeo_27;

public class Mamifero extends Animal {

	private String corpelo;
	
		@Override
	public void EmitirSom() {
System.out.println("Emitindo Som de Mamifero");		
	}
	
	//GETS E SETS 





	public String getCorpelo() {
		return corpelo;
	}

	public void setCorpelo(String corpelo) {
		this.corpelo = corpelo;
	}
	
	
}
