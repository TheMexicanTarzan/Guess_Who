package Pokemon;

class Grass extends Pokemon{
	private String[] grass = new String[] {"Bulbasaur", "Chikorita", "Treecko", "Rowlet", 
	"Sprigatito"};
	private String p;
	
	protected Grass(String c, String a1, String a2, String a3, String a4, String p) {
		super(c, a1, a2, a3, a4);
		this.p = p;
	}
	
	protected String getPok() {
		String pok;
		String[] b = getGrass();
		pok = b[r.nextInt(5)];
		return pok;
	}

	protected String[] getGrass() {
		return grass;
	}
	
	protected String getP() {
		return p;
	}

}