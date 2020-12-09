
import java.util.Scanner;
public class VierGewinnt{

	
    public static void gamefield(char[][] spielfeld){
        System.out.println("");
        System.out.println(" 0 1 2 3 4 5 6");
        System.out.println("_______________");
        for (int reihe = 0; reihe < spielfeld.length; reihe++){
            System.out.print("|");
            for (int strich = 0; strich < spielfeld[0].length; strich++){
                System.out.print(spielfeld[reihe][strich]);
                System.out.print("|");
            }
            System.out.println();
            System.out.println("_______________");
        }
        System.out.println(" 0 1 2 3 4 5 6");
        System.out.println();

    }
    
    public static int eingabe(int player) { 
    	System.out.println("Geben Sie die FeldNr für" + player + "ein:");
    	Scanner s = new Scanner(System.in);
    	int feld = s.nextInt();
    	return feld;
    }
    
    public static char[][] steinPlatzieren(char[][] spielfeld, int spalte, int player){
    	char stein;
    	if(player == 1) {
    		stein = 'O';
    	}else {
    		stein = 'X';
    	}
    	spielfeld[spalte][0] = stein;
    	
    	
    	return spielfeld;
    }
    
    public static void main (String[] args) {
        char[][] spielfeld = new char[6][7];
        int player = 1;
       
        gamefield(spielfeld);
        int spalte = eingabe(player);
        spielfeld = steinPlatzieren(spielfeld, spalte, player);
        gamefield(spielfeld);
    }
}