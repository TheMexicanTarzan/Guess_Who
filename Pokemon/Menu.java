package Pokemon;
import java.util.Random;
import java.util.Scanner;

class Menu {
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	
	
	protected Pokemon whoIsThatPokemon(Pokemon []p) {
		Pokemon[] a = p;
		int j = r.nextInt(14);
		return a[j];
	}
	
	protected int question(int a, Pokemon p, Pokemon[] d) {
		Pokemon b = p;
		int j = a; 
		int guess, chosen1;
		String c, chosen2;
		if (j == 0) {
			System.out.println(" Who is that Pokemon?");
			chosen2 = s.nextLine();
			if (b.getP().equals(chosen2)) {
				System.out.println(" You Win!");
			}
			else {
				System.out.println(" You Lose!");
			}
			System.exit(0);
		}
		System.out.println("You have " + j + " question(s) remaining.");
		System.out.println("What do you wish to ask about? \n (1): Type \n (2): Attacks");
		guess = s.nextInt();
		switch (guess) {
			case 1:
				System.out.println(" (1): WATER \n (2): FIRE \n (3): GRASS");
				chosen1 = s.nextInt();
				if (chosen1 == 1) {
					c = "WATER";
					if (c == p.getC()) {
						System.out.println("");
						System.out.println("Correct!");
						System.out.println("");
						j--;
						d = printTable_1(d, c);
						question(j, b, d);
					}
					else {
						System.out.println("");
						System.out.println("Incorrect!");
						System.out.println("");
						j--;
						d = printTable_3(d);
						question(j, b, d);
					}
				}
				else if (chosen1 == 2) {
					c = "FIRE";
					if (c == p.getC()) {
						System.out.println("");
						System.out.println("Correct!");
						System.out.println("");
						j--;
						d = printTable_1(d, c);
						question(j, b, d);
					}
					else {
						System.out.println("");
						System.out.println("Incorrect!");
						System.out.println("");
						j--;
						d = printTable_3(d);
						question(j, b, d);
					}
				}
				else if (chosen1 == 3) {
					c = "GRASS";
					if (c == p.getC()) {
						System.out.println("");
						System.out.println("Correct!");
						System.out.println("");
						j--;
						d = printTable_1(d, c);
						question(j, b, d);
					}
					else {
						System.out.println("");
						System.out.println("Incorrect!");
						System.out.println("");
						j--;
						d = printTable_3(d);
						question(j, b, d);
					}
				}
			case 2:
				System.out.println(" What attack?");
				s.nextLine();
				chosen2 = s.nextLine();
				System.out.println(chosen2);
				if (p.getA1().equals(chosen2) || p.getA2().equals(chosen2) || p.getA3().equals(chosen2) || p.getA4().equals(chosen2)) {
					System.out.println("");
					System.out.println("Correct!");
					System.out.println("");
					j--;
					d = printTable_2(d, chosen2);
					return question(j, b , d);
				}
				else {
					System.out.println("");
					System.out.println("Incorrect!");
					System.out.println("");
					j--;
					d = printTable_3(d);
					question(j, b, d);
				}
				
				
		}
		return j;
	}
	
	protected Pokemon[] printTable_1(Pokemon [] b, String c) {
		Pokemon[] p = b;
		int a1 = 0, a2 = 0, a3 = p.length;
		for (int i = 0; i < a3; i++) {
			if(p[i].getC() == c) {
				if (p[i].getC() == "WATER") {
					a1++;
					System.out.println(((Water)p[i]).getP() + " || " + p[i].getC() + " || [ " + p[i].getA1() + ", " + p[i].getA2() + ", " + p[i].getA3() + ", " + p[i].getA4() + " ]");
				}
				else if (p[i].getC() == "FIRE") {
					a1++;
					System.out.println(((Fire)p[i]).getP() + " || " + p[i].getC() + " || [ " + p[i].getA1() + ", " + p[i].getA2() + ", " + p[i].getA3() + ", " + p[i].getA4() + " ]");
				}
				else if (p[i].getC() == "GRASS") {
					a1++;
					System.out.println(((Grass)p[i]).getP()+ "||" + " || " + p[i].getC() + " || [ " + p[i].getA1() + ", " + p[i].getA2() + ", " + p[i].getA3() + ", " + p[i].getA4() + " ]");
				}
			}
		}
		System.out.println("");
		Pokemon[] d = new Pokemon[a1];
		for (int i = 0; i < a3; i++) {
			if(p[i].getC() == c) {
				if (p[i].getC() == "WATER") {
					d[a2] = p[i];
					a2++;
				}
				else if (p[i].getC() == "FIRE") {
					d[a2] = p[i];
					a2++;
				}
				else if (p[i].getC() == "GRASS") {
					d[a2] = p[i];
					a2++;
				}
			}
		}
		return d;
	}
	
	protected Pokemon[] printTable_2(Pokemon [] b, String c) {
		Pokemon[] p = b;
		int a1 = 0, a2 = 0, a3 = p.length;
		for (int i = 0; i < a3; i++) {
			if (p[i].getA1().equals(c) || p[i].getA2().equals(c) || p[i].getA3().equals(c) || p[i].getA4().equals(c)) {
				if (p[i].getC() == "WATER") {
					a1++;
					System.out.println(((Water)p[i]).getP() + " || " + p[i].getC() + " || [ " + p[i].getA1() + ", " + p[i].getA2() + ", " + p[i].getA3() + ", " + p[i].getA4() + " ]");
				}
				else if (p[i].getC() == "FIRE") {
					a1++;
					System.out.println(((Fire)p[i]).getP() + " || " + p[i].getC() + " || [ " + p[i].getA1() + ", " + p[i].getA2() + ", " + p[i].getA3() + ", " + p[i].getA4() + " ]");
				}
				else if (p[i].getC() == "GRASS") {
					a1++;
					System.out.println(((Grass)p[i]).getP() + " || " + p[i].getC() + " || [ " + p[i].getA1() + ", " + p[i].getA2() + ", " + p[i].getA3() + ", " + p[i].getA4() + " ]");
				}
			}
		}
		Pokemon[] d = new Pokemon[a1];
		for (int i = 0; i < a3; i++) {
			if (p[i].getA1().equals(c) || p[i].getA2().equals(c) || p[i].getA3().equals(c) || p[i].getA4().equals(c)) {
				if (p[i].getC() == "WATER") {
					d[a2] = p[i];
					a2++;
				}
				else if (p[i].getC() == "FIRE") {
					d[a2] = p[i];
					a2++;
				}
				else if (p[i].getC() == "GRASS") {
					d[a2] = p[i];
					a2++;
				}
			}
		}
		return d;
	}
	
	protected Pokemon[] printTable_3(Pokemon [] b) {
		Pokemon[] p = b;
		int a3 = p.length;
		for (int i = 0; i < a3; i++) {
			if (p[i].getC() == "WATER") {
				System.out.println(((Water)p[i]).getP() + " || " + p[i].getC() + " || [ " + p[i].getA1() + ", " + p[i].getA2() + ", " + p[i].getA3() + ", " + p[i].getA4() + " ]");
			}
			else if (p[i].getC() == "FIRE") {
				System.out.println(((Fire)p[i]).getP() + " || " + p[i].getC() + " || [ " + p[i].getA1() + ", " + p[i].getA2() + ", " + p[i].getA3() + ", " + p[i].getA4() + " ]");
			}
			else if (p[i].getC() == "GRASS") {
				System.out.println(((Grass)p[i]).getP() + " || " + p[i].getC() + " || [ " + p[i].getA1() + ", " + p[i].getA2() + ", " + p[i].getA3() + ", " + p[i].getA4() + " ]");
			}
		}
		System.out.println("");
		return p;
	}

}
