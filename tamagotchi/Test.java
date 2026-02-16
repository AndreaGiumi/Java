
package tamagotchi;

public class Test {
	public static void main(String[] args) {
		Tamagotchi t = new Tamagotchi("luna", "Gatto");
		
		System.out.println(t);
		
		t.mangia();
		
		System.out.println(t);
		
		t.dorme();
		
		System.out.println(t);
		
		t.gioca();
		System.out.println(t);
	}
	
}
