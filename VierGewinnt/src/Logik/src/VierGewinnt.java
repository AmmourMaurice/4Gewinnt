
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
    	System.out.println("Geben Sie die FeldNr ein um ihren Stein zu platzieren:");
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
    	spielfeld[5][spalte] = stein;
    	if(spielfeld[5][5] == 'O' || spielfeld[5][5] == 'X') {
    		spielfeld[5][stein] = spielfeld[4][stein]; //stein muss getauscht werden warscheinlich für platz der zeile in spalte 4
    	}
    		
    	
    	return spielfeld;
    }
    
    public static void main (String[] args) {
        char[][] spielfeld = new char[6][7];
        int player = 1;
        int spielzug = 1;
        boolean gewinner = false;
       
        gamefield(spielfeld);
        int spalte = eingabe(player);
        spielfeld = steinPlatzieren(spielfeld, spalte, player);
        gamefield(spielfeld);
        
        while (gewinner == false || spielzug <=42)
        {

        }
        
        
    }
}