
package rubrica;

public class Main {

	public static void main(String[] args) {
		Contatto pers1 = new Contatto("Andrea", "Giumi", "3480302938");
		Contatto pers2 = new Contatto("Luca", "Rossi", "3462568987");
		Contatto pers3 = new Contatto("Alessio", "Giumi", "3336895247");
		System.out.println(pers1);
		
		
		Rubrica rubrica1 = new Rubrica();
		
		rubrica1.addContatto(pers1);
		rubrica1.addContatto(pers2);
		rubrica1.addContatto(pers3);
		
		System.err.println(rubrica1.cercaContattoByName("Alessio"));
		
		
		
		
		
	}
	
	

}
