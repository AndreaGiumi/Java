
package corsoJava;

public class TestPersona {
	public static void main(String[] args) {
		Persona p = new Persona("Andrea",28, 115.5);
		
		p.setEta(40);

		System.out.println(p);
		
		p.cresce();
		
		System.out.println(p);
		p.cresce(114);
		
		System.out.println(p);
	}
}
