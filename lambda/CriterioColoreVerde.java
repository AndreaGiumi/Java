
package lambda;

public class CriterioColoreVerde implements Criterio {

	@Override
	public boolean test(Mela mela) {
		if(mela.getColore().equals("verde"))
			return true;
		else {
			return false;
		}
		
	}

}
