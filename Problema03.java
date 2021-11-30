package laborator5;

import java.util.*;

class NumarNegativ extends Exception {
	public void ExceptieNumarNegativ() {
		System.out.print("Numarul introdus este negativ!");
	}
}

class Numar {
	int nr;
	
	public void myRead (Vector<Integer> vect) {
		Scanner scan = new Scanner(System.in);
		NumarNegativ n = new NumarNegativ();
		this.nr = scan.nextInt();
		if (this.nr >= 0) {
			vect.add(this.nr);
			return;
		}
		throw (n);
	}
	
}

public class Problema3 {
	
	public static void main(String[] args) {
		Vector<Integer> vect = new Vector<Integer>(100);
		try {
			Numar num = new Numar();
			num.myRead(vect);
			System.out.println ("Numarul introdus este: " + num + "\n");
		}
		catch (NumarNegativ n){
			System.out.println ("Numarul introdus este negativ.");
			System.out.println ("Maximul numarelor introduse pana acum este: " + Collections.max (vect));
		}
		finally {
			System.out.println ("Ceea ce este introdus nu este numar.");
		}
		
	}

}
