package Pokemon;
import java.util.Random;
class Program {
	Random r = new Random();
	Menu m = new Menu();
	private Pokemon[] p = new Pokemon[15];
	
	protected Pokemon[] pokemonTable() {
		int j, a = 0;
		Pokemon[] p = getP();
		Pokemon p1 = new Water("", "", "", "", "", "");
		Pokemon p2 = new Fire("", "", "", "", "", "");
		Pokemon p3 = new Grass("", "", "", "r", "", "");
		for (int i = 0; i < 15; i++) {
			j = r.nextInt(15);
			if(j < 5) {
				p[i] = new Water("WATER", p1.pokAttk(), p1.pokAttk(), p1.pokAttk(), p1.pokAttk(), ((Water)p1).getPok());
				for (int k = 0; k < i; k++) {
					if (p[k].getClass() == p[i].getClass()) {
						if (String.valueOf(((Water)p[i]).getP()) != String.valueOf(((Water)p[k]).getP())) {
							a = 0;
						}
						else {
							a = 1;
							break;
						}
					}
				}
				if (a == 1) {
					a = 0;
					i--;
				}
			}
			else if (j > 4 && j < 10) {
				p[i] = new Fire("FIRE", p2.pokAttk(), p2.pokAttk(), p2.pokAttk(), p2.pokAttk(), ((Fire)p2).getPok());
				for (int k = 0; k < i; k++) {
					if (p[k].getClass() == p[i].getClass()) {
						if (String.valueOf(((Fire)p[i]).getP()) != String.valueOf(((Fire)p[k]).getP())) {
							a = 0;
						}
						else {
							a = 1;
							break;
						}
					}
				}
				if (a == 1) {
					a = 0;
					i--;
				}
			}
			else if (j > 9) {
				p[i] = new Grass("GRASS", p3.pokAttk(), p3.pokAttk(), p3.pokAttk(), p3.pokAttk(), ((Grass)p3).getPok());
				for (int k = 0; k < i; k++) {
					if (p[k].getClass() == p[i].getClass()) {
						if (String.valueOf(((Grass)p[i]).getP()) != String.valueOf(((Grass)p[k]).getP())) {
							a = 0;
						}
						else {
							a = 1;
							break;
						}
					}
				}
				if (a == 1) {
					a = 0;
					i--;
				}
			}
		}
		return p;
	}
	
	protected void getTable() {
		Pokemon[] p = pokemonTable();
		for (int i = 0; i < 15; i++) {
			if (p[i].getC() == "WATER") {
				System.out.println(((Water)p[i]).getP() + " " + p[i].getC() + " " + p[i].getA1() + " " + p[i].getA2() + " " + p[i].getA3() + " " + p[i].getA4());
			}
			else if (p[i].getC() == "FIRE") {
				System.out.println(((Fire)p[i]).getP() + " " + p[i].getC() + " " + p[i].getA1() + " " + p[i].getA2() + " " + p[i].getA3() + " " + p[i].getA4());
			}
			else if (p[i].getC() == "GRASS") {
				System.out.println(((Grass)p[i]).getP() + " " + p[i].getC() + " " + p[i].getA1() + " " + p[i].getA2() + " " + p[i].getA3() + " " + p[i].getA4());
			}
		}
		System.out.println("");
		
		m.whoIsThatPokemon(p);
		
		Pokemon j = m.whoIsThatPokemon(p);
		
		if (j.getC() == "WATER") {
			System.out.println(((Water)j).getP() + " " + j.getC() + " " + j.getA1() + " " + j.getA2() + " " + j.getA3() + " " + j.getA4());
		}
		else if (j.getC() == "FIRE") {
			System.out.println(((Fire)j).getP() + " " + j.getC() + " " + j.getA1() + " " + j.getA2() + " " + j.getA3() + " " + j.getA4());
		}
		else if (j.getC() == "GRASS") {
			System.out.println(((Grass)j).getP() + " " + j.getC() + " " + j.getA1() + " " + j.getA2() + " " + j.getA3() + " " + j.getA4());
		}
		
		System.out.println("");
		
		m.question(4, j, p);
	}
	
	protected Pokemon[] getP() {
		return p;
	}
	
	protected void execute() {
		getTable();
	}

}
