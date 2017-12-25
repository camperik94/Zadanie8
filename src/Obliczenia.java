
public class Obliczenia {
	private int numberA;
	private int numberB;

	public int getNumberA() {
		return numberA;
	}

	public void setNumberA(int numberA) {
		this.numberA = numberA;
	}

	public int getNumberB() {
		return numberB;
	}

	public void setNumberB(int numberB) {
		this.numberB = numberB;
	}

	public Obliczenia(int numberA, int numberB) {
		this.numberA = numberA;
		this.numberB = numberB;
	}

	public void funkcjaFor() {
		int suma = numberA;
		int liczba = 0;
		for (int i = numberA; i < numberB; i++) {
			liczba = liczba + (i - numberA);
			suma += liczba;
		}
		System.out.println(suma);
	}

	public void funkcjaWhile() {
		int suma = numberA;
		int liczba = 0;
		int i = numberA;
		while (i < numberB) {
			liczba = liczba + (i - numberA);
			suma += liczba;
			i++;
		}
		System.out.println(suma);
	}

	public void funkcjaDoWhile() {
		int suma = numberA;
		int liczba = 0;
		int i = numberA;

		do {
			liczba = liczba + (i - numberA);
			suma += liczba;
			i++;
		} while (i < numberB);
		System.out.println(suma);
	}

}
