package Logik;
import java.util.Scanner;
public class VierGewinnt {

	public static String Spielfeld(int feld) {
		Scanner s = new Scanner(System.in);
		String[] eingabe = s.nextString();
		System.out.println("\n");
		for(int i = 0; i < 6; i++) {
			System.out.println("|__|__|__|__|__|__|__|\n");
		}
//		System.out.println("");
//		System.out.println("|__|__|__|__|__|__|__|\n");
//		System.out.println("|__|__|__|__|__|__|__|\n");
//		System.out.println("|__|__|__|__|__|__|__|\n");
//		System.out.println("|__|__|__|__|__|__|__|\n");
//		System.out.println("|__|__|__|__|__|__|__|\n");
//		System.out.println("|__|__|__|__|__|__|__|\n");
		return "";
		// in Felder m�ssen Pl�tze von Array initialisert werden damit wir in die Felder schreiben k�nnen d.h. brauchen Array mit 0 - 41 Stellen
	}
	public static void main(String[] args) {
		Spielfeld(6);

	}

}
