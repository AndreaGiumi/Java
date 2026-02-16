package arcaDiNoe;


import java.util.ArrayList;

public class Arca {
	private ArrayList<Animale> animali;
	
	
	public Arca(){
		this.animali = new ArrayList<>();
	}
	
	public void salva(Animale a) {
		int count = 0;
		
		for (Animale animale : animali) {
			if(animale.getClass().equals(a.getClass())) {
				count ++;
			}
			
		}
		
		if(count > 2) {
			animali.add(a);
			System.out.println("Animale inserito nell'arca");
		}else {
			System.out.println("Non puoi inserire più di due animali delle stessa razza");
		}
	}
	
	public int getNumeroAnimali() {
		return animali.size();
	}
	
	public String coro() {
		StringBuilder sb = new StringBuilder();
		for (Animale a : animali) {
			sb.append(a.verso()).append(" ");
	
		}
		return sb.toString();
	}
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--- CONTENUTO ARCA ---\n");
        for (Animale a : animali) {
            sb.append(a.toString()).append("\n");
        }
        return sb.toString();
    }

}