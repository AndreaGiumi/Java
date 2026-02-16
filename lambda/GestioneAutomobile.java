
package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GestioneAutomobile {

	public static void main(String[] args) {
		
		ArrayList<Automobile> concessionario = new ArrayList<>();
		
		
		concessionario.add(new Automobile("Fiat", "Panda", "CB251SF"));
		concessionario.add(new Automobile("Fiat", "Punto", "FA147FG"));
		concessionario.add(new Automobile("Alfa Romeo", "Giulia", "GH263DF"));
		concessionario.add(new Automobile("Renaut", "Clio", "FF225CV"));
		concessionario.add(new Automobile("Fiat", "Panda", "DD654LP"));
		concessionario.add(new Automobile("Lamborghini", "Urus", "HB352SS"));
		
		

	List<Automobile> soloFiat = filtro(concessionario, auto -> auto.getMarca().equals("Fiat"));
	
		System.out.println("Auto con marca Fiat");
	System.out.println();
		for (Automobile automobile : soloFiat) {
			System.out.println(automobile);
			
		}
		System.out.println("Auto con targa pari");
		System.out.println();
		
		List<Automobile> soloPari = filtro(concessionario,auto -> auto.polishTarga() % 2 == 0);
		
		for (Automobile automobile : soloPari) {
			System.out.println(automobile);
			
		}
	
		System.out.println("Auto con targa dispari");
		System.out.println();
	
	List<Automobile> soloDispari = filtro(concessionario, auto -> auto.polishTarga() % 2 != 0);
		for (Automobile automobile : soloDispari) {
			System.out.println(automobile);
		}

	}
	
	
	public static List<Automobile> filtro(List<Automobile> a , CriterioA criterio){
		ArrayList<Automobile> autoFiltrate = new ArrayList<>();
		
		for (Automobile automobile : a) {
			if(criterio.test(automobile) == true)
				autoFiltrate.add(automobile);
				
		}
		return autoFiltrate;
		
	}

	
}
