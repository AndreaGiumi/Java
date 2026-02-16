
package lambda;

public class CriterioPeso implements Criterio {

	@Override
	public boolean test(Mela mela) {
		if(mela.getPeso() > 150)
			return true;
		else {
			return false;
		}
	}

}
