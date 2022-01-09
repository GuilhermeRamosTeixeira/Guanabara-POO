package Vídeo_27;

public class Cachorro extends Lobo {

	@Override
	public void EmitirSom() {
		System.out.println("AU! AU! AU!");
	}
	
	public void Reagir(String frase) {
		if(frase.equals("Toma Petisco")  || frase.equals("Ola") ) {
			System.out.println("Abanando o rabo!!!");
		}else {
			System.out.println("Rosnando!!!!");
		}
			
	}

public void Reagir(int hora , int min) {
	
	if(hora<12)
		System.out.println("Abanando o Rabo");
	else if (hora >=18)
		System.out.println("Ignorando");
	else
		System.out.println("Abanando o rabo e latindo");
	}

public void Reagir(boolean dono) {
	
	if(dono ==true)
		System.out.println("Abanando o Rabo!!!");
	else
		System.out.println("Rosnando e Latindo");
	
}

public void Reagir(int idade , double peso) {
	
	if (idade<5) {
		if (peso<10) {
			System.out.println("Abanando o Rabo");
		} else {
			System.out.println(" Latindo!!!");

		}
		
	} else {
		if (peso<10) {
			System.out.println("Rosnando!!!");
		} else {
System.out.println("Ignorando!!!!");
		}

	}
}
}
