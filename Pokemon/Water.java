package Pokemon;

class Water extends Pokemon{
	private String[] water = new String[] {"Squirtle", "Totodile", "Mudkip", "Froakie", 
	"Quaxly"};
	private String p;

	protected Water(String c, String a1, String a2, String a3, String a4, String p) {
		super(c, a1, a2, a3, a4);
		this.p = p;
	}
	
	protected String getPok() {
		String pok;
		String[] b = getWater();
		pok = b[r.nextInt(5)];
		return pok;
	}

	protected String[] getWater() {
		return water;
	}
	
	protected String getP() {
		return p;
	}

}