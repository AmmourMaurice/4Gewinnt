package Logik;

public class VierGewinnt {

	public static String Spielfeld(int feld) {
		System.out.println("");
		System.out.println("|__|__|__|__|__|__|__|\n");
		System.out.println("|__|__|__|__|__|__|__|\n");
		System.out.println("|__|__|__|__|__|__|__|\n");
		System.out.println("|__|__|__|__|__|__|__|\n");
		System.out.println("|__|__|__|__|__|__|__|\n");
		System.out.println("|__|__|__|__|__|__|__|\n");
		return "";
		// in Felder müssen Plätze von Array initialisert werden damit wir in die Felder schreiben können d.h. brauchen Array mit 0 - 41 Stellen
	}
	public static void main(String[] args) {
		Spielfeld(6);

	}

}
