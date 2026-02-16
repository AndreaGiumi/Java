
package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GestioneMele {

	public static void main(String[] args) {
		// creo una lista di mele
		
		ArrayList<Mela> cassetta = new ArrayList<>();
		
		cassetta.add(new Mela("rossa", 100));
		cassetta.add(new Mela("verde", 150));
		cassetta.add(new Mela("rossa", 200));
		cassetta.add(new Mela("gialla", 100));
		cassetta.add(new Mela("gialla", 100));
		cassetta.add(new Mela("verde", 100));
		cassetta.add(new Mela("rossa", 100));
		
		List<Mela> risultato = filtraPerColore(cassetta);
		
		System.out.println("solo le mele verdi");
		
		for (Mela mela : risultato) {
			System.out.println(mela);
			
		
		
		}
		
		
		risultato = filtraPerPeso(cassetta);
		
		for (Mela mela : risultato) {
			System.out.println(mela);
		}
		
		System.out.println();
		
		risultato = filtraMele(cassetta, mela->mela.getColore().equals("gialla") && mela.getPeso() == 100);
		for (Mela mela : risultato) {
			System.out.println(mela);

		}
		
		
		
	}
	public static List<Mela> filtraPerColore(List<Mela> cassetta){
		ArrayList<Mela> listaFiltrata = new ArrayList<>();
		for (Mela mela : cassetta) {
			if(mela.getColore().equals("verde")) {
				listaFiltrata.add(mela);
			}
		}
		return listaFiltrata;
		
	}

	public static List<Mela> filtraPerPeso(List<Mela> cassetta){
		ArrayList<Mela> listaFiltrata = new ArrayList<>();
		for (Mela mela : cassetta) {
			if(mela.getPeso()> 150	) {
				listaFiltrata.add(mela);
			}
		}
		return listaFiltrata;
	}
	
	
	public static List<Mela> filtraMele(List<Mela> cassetta, Predicate<Mela> criterio){
		ArrayList<Mela> filtrata = new ArrayList<>();
		
		for (Mela mela : cassetta) {
			if(criterio.test(mela) == true) {
				filtrata.add(mela);
			}
		}
		return filtrata;
	}
}
