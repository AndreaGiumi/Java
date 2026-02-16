
package mappe;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class EsercizioMappe {

	public static void main(String[] args) {
		TreeMap<Integer, Studente> mappa = new TreeMap<>(new IntegerComparetor());
		System.out.println(mappa);
		
		Studente s = new Studente(123, "andrea", 2021);
		mappa.put(s.getMatricola(), s);
		
		Studente s1 = new Studente(124, "alessio", 2025);
		mappa.put(s1.getMatricola(), s1);
		
		System.out.println(mappa);
		
		Set<Entry<Integer, Studente>> set = mappa.entrySet();
		
		for (Entry<Integer, Studente> entry : set) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		// inserisco una chiave doppia
		
		Studente s2 = new Studente(123, "luca", 2022);
		
		if(!mappa.containsKey(s2.getMatricola()))
			mappa.put(s2.getMatricola(), s2);
		
		set = mappa.entrySet();
		
		for (Entry<Integer, Studente> entry : set) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
