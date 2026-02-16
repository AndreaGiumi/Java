
package operazioneProdotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		ArrayList<Prodotto> catalogo = new ArrayList<Prodotto>();
		catalogo.add(new Prodotto(133, "latte", "alimentare", 100, true, 2.5, 0));
		catalogo.add(new Prodotto(134, "latte UHT", "alimentare", 0, false, 2.5, 0));
		catalogo.add(new Prodotto(113, "pomodori", "alimentare", 50, true, 1.5, 5));
		catalogo.add(new Prodotto(123, "libro", "media", 10, true, 10, 5));
		catalogo.add(new Prodotto(155, "maglietta", "abbigliamento", 20, true, 25, 10));
		catalogo.add(new Prodotto(184, "cd musicale", "media", 0, false, 12.5, 0));
		catalogo.add(new Prodotto(143, "smartphone", "elettronica", 80, true, 250, 20));
		catalogo.add(new Prodotto(144, "cuffie", "elettronica", 0, false, 250, 10));
		
		//1
		long distinctCategoria = 
				catalogo.stream()
				.map(p -> p.getCategoria())
				.distinct()
				.count();
		System.out.println("Il numero di categorie distinte è: " + distinctCategoria);
		
		//2
		List<String> sortCategoria = 
				catalogo.stream()
				.map(p -> p.getCategoria())
				.sorted((p1, p2) -> p1.compareTo(p2))
				.distinct()
				.collect(Collectors.toList());
		System.out.println(sortCategoria);
		
		//3
		List<String> orderNomeProd = 
				catalogo.stream()
				.sorted((p1, p2) -> Double.compare(p1.getPrezzo(), p2.getPrezzo()))
				.map(p -> p.getDescrizione())
				.collect(Collectors.toList());
		System.out.println(orderNomeProd);
		
		
		//4
		List<Prodotto> orderSconto =
				catalogo.stream()
				.sorted((p1, p2) -> Integer.compare(p1.getSconto(), p2.getSconto()))
				.toList();
		System.out.println(orderSconto);
		
		// 5
		Prodotto maxSconto = 
				catalogo.stream()
				.sorted((p1, p2) -> Integer.compare(p2.getSconto(), p1.getSconto()))
				.findFirst().get();
			
		System.out.println(maxSconto);
		
		//6
		double sumProd = 
				catalogo.stream()
				.filter(p -> p.getCategoria().equals("alimentare"))
				.mapToDouble(p -> p.getPrezzo())
				.sum();
		System.out.println(sumProd);
		
		//7
		Optional<Prodotto> nullProd = 
				catalogo.stream()
				.filter(p -> p.getCategoria().equals("giocattoli"))
				.findAny();
		System.out.println(nullProd);
		
		//8
		Optional<Prodotto> maxPrezzoMedia = 
				catalogo.stream()
				.filter(p -> p.getCategoria().equals("media"))
				.sorted((p1, p2) -> Double.compare(p2.getPrezzo(), p1.getPrezzo()))
				.findFirst();
		System.out.println(maxPrezzoMedia);
		
		//9
		List<String> nomeProdFalse = 
				catalogo.stream()
				.filter(p -> p.isDisponibilità()== false)
				.map(p -> p.getDescrizione())
				.toList();
		System.out.println(nomeProdFalse);
		
			
				
	}
	
}
	
