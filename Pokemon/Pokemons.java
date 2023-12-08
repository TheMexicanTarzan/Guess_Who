package Pokemon;
import java.util.Random;

abstract class Pokemon {
	protected Random r = new Random();
	private String[] attk = new String[] {"Hydro pump", "Solar Beam", "Eruption", "Flamethrower", 
									"Aqua Jet", "Whirlpool", "Synthesis", "Petal Dance"};
	private String a1, a2, a3, a4, c;
	
	protected Pokemon(String c, String a1, String a2, String a3, String a4) {
		this.c = c;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
	}
	
	protected String pokAttk() {
		int j = r.nextInt(8);
		String [] b = getAttk();
		String a, a1 = getA1(), a2 = getA2(), a3 = getA3(), a4 = getA4();
		if (b[j] != a1 && b[j] != a2 && b[j] != a3 && b[j] != a4) {
			a = b[j];
			return a;
		}
		else {
			pokAttk();
			return "";
		}
	}
	
	protected String[] getAttk() {
		return attk;
	}
	
	protected String getA1() {
		return a1;
	}
	
	protected String getA2() {
		return a2;
	}
	
	protected String getA3() {
		return a3;
	}
	
	protected String getA4() {
		return a4;
	}
	
	protected String getC() {
		return c;
	}
	
	protected abstract String getP();

}
