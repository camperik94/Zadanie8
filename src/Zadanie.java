import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Podaj dwie liczby A < B");

		System.out.println("Podaj A");
		
		int a = in.nextInt();
		
		System.out.println("Podaj B");
		
		int b = in.nextInt();
		
		in.close();
		
		Obliczenia obl = new Obliczenia(a, b);
		
		obl.funkcja();


	}
}
