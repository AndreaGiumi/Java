
package tamagotchi;

public class Tamagotchi {
	private String nome;
	private String specie;
	private double peso;
	private double altezza;
	private int energia = 3;


	// costruttore 1
	public Tamagotchi(String nome, String specie) {
		this.nome = nome;
		
		switch (specie) {
		case "Cane": {
			this.specie = "Cane";
			altezza = 20;
			peso = 300;
			break;
		}
		case "Gatto":{
			this.specie = "Gatto";
			altezza = 10;
			peso = 100;
			break;

		}
		case "Canarino":{
			this.specie = "Canarino";
			altezza = 3;
			peso = 10;
			break;

		}
		case "Coniglio":{
			this.specie = "Coniglio";
			altezza = 10;
			peso = 100;
			break;

		}
		default:
			this.specie = "Cane";
			altezza = 20;
			peso = 300;
		}
		
	}


	// costruttore 2
	public Tamagotchi(String nome) {
		this.nome = nome;
		altezza = 20;
		peso = 300; //in grammi
		specie = "Cane";
	}

// metodi di classe

	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		if(peso >= 0)
			this.peso = peso;
	}



	public double getAltezza() {
		return altezza;
	}



	public void setAltezza(double altezza) {
		if(altezza >0)
			this.altezza = altezza;
	}



	public int getEnergia() {
		return energia;
	}



	public void setEnergia(int energia) {
		this.energia = energia;
	}



	public String getNome() {
		return nome;
	}



	public String getSpecie() {
		return specie;
	}
	
	public boolean mangia() {
		altezza += 1;
		peso += 150;
		if(energia <10) {
			energia += 1;
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public boolean dorme() {
		if(energia <10) {
			energia += 1;
			return true;
		}else {
			return false;
		}
	}
	
	
	public boolean gioca() {
		if(peso >= 100 && energia > 0) {
			peso -= 100;
			energia -= 1;
			return true;
		}else {
			return false;
		}
	}


	@Override
	public String toString() {
		return "Tamagotchi [nome=" + nome + ", specie=" + specie + ", peso=" + peso + ", altezza=" + altezza
				+ ", energia=" + energia + "]";
	}
	
	









}
