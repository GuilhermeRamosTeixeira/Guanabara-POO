package Vídeo_25;

public class Principal {

	public static void main(String[] args) {

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(45.6);
		m.setCorpelo("Preto");
		m.Alimentar();
		m.Locomover();
		m.EmitirSom();
		
		a.EmitirSom();
	}

}
