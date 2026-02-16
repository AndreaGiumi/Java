
package azienda;

import java.util.Date;

public class Main_impiegato {

	public static void main(String[] args) {
		
		System.out.println(Impiegato.getContatore());
		
		Impiegato imp1 = new Impiegato("Andrea", 2000, new Date());
		System.out.println(imp1);
		System.out.println(Impiegato.getContatore());
		Impiegato imp2 = new Impiegato("Dioni", 2500, new Date(125,5,5));
		
		System.out.println(imp2);

		System.out.println(Impiegato.getContatore());
		System.out.println(imp1.getSalario());
		imp1.incrSalario(500);
		
		System.out.println(imp1.getSalario());
		
		Azienda azienda = new Azienda("eng");
		
		System.out.println(azienda);
		
		azienda.assume(imp1);
		azienda.assume(imp2);
		
		System.out.println(azienda);
		
		azienda.incrSalarioPerTutti(50);
		
		System.out.println(azienda);
		
		Manager m1 = new Manager("Andri", 3000, new Date(), "luna");
		Manager m2 = new Manager("Ale", new Date(115,1,1), "anna");
		
		System.out.println(m1);
		System.out.println(m2);
		
		m1.incrSalario(100);
		m2.incrSalario(100);
		
		System.out.println("dopo l'aumento...");
		
		System.out.println(m1);
		System.out.println(m2);
		
		
		azienda.assume(m1);
		azienda.assume(m2);
		
		System.out.println(azienda);
		
		azienda.incrSalarioPerTutti(100);
		
		System.out.println(azienda);

	}

}
