
package mappe;

import java.util.Comparator;

public class IntegerComparetor implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1); // induco l'ordinamento decrescente
	}

}
