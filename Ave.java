package Vídeo_25;

public class Ave extends Animal {
	
	private String corpena;
	
	public void FazerNinho() {
		System.out.println("Construindo ninho");
	}

	

	
	@Override
	public void Locomover() {
System.out.println("Voando!!!");		
	}



	@Override
	public void Alimentar() {
System.out.println("Comendo frutas");		
	}



	@Override
	public void EmitirSom() {
System.out.println("Som de ave!!!");		
	}

	//GETS E SETS

	public String getCorpena() {
		return corpena;
	}

	public void setCorpena(String corpena) {
		this.corpena = corpena;
	}

}
