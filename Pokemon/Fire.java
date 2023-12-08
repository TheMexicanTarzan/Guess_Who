package Pokemon;

class Fire extends Pokemon{
	private String[] fire = new String[] {"Charmander", "Cyndaquil", "Torchic", "Litten", 
	"Fuecoco"};
	private String p;
	
	protected Fire(String c, String a1, String a2, String a3, String a4, String p) {
		super(c, a1, a2, a3, a4);
		this.p = getPok();
	}
	
	protected String getPok() {
		String pok;
		String[] i = getFire();
		pok = i[r.nextInt(5)];
		return pok;
	}
	
	protected String[] getFire() {
		return fire;
	}
	
	protected String getP() {
		return p;
	}
	
}