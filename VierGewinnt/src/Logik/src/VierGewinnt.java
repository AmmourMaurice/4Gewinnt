import java.util.Scanner;
public class VierGewinntProjekt{


    public static void erzeugeSpielfeld(char[][] spielfeld){
        System.out.println("");
        System.out.println(" 0 1 2 3 4 5 6");
        System.out.println("_______________");
        for (int zeile = 0; zeile < spielfeld.length; zeile++){
            System.out.print("|");
            for (int spalte = 0; spalte < spielfeld[0].length; spalte++){
                System.out.print(spielfeld[zeile][spalte]);
                System.out.print("|");
            }
            System.out.println();
            System.out.println("_______________");
        }
        System.out.println(" 0 1 2 3 4 5 6");
        System.out.println();
    }
    public static void spielzug(char[][] spielfeld,int player) {
        Scanner eingabe = new Scanner(System.in);
        erzeugeSpielfeld(spielfeld);
        System.out.println("Spieler " + player + " wähle eine Spalte aus");
        int play = eingabe.nextInt();
//        spielzugBestaetiegen(spielfeld, play);
        if (spielzugBestaetiegen(spielfeld, play) == true) {
        spielfeld[5][play] = 'X';
        erzeugeSpielfeld(spielfeld);
        } else{ while(spielzugBestaetiegen(spielfeld, play)==false) {
        	 //Abfrage welche der beiden Bedingungen falsch ist und dann entweder Wiederholung oder Korrektur nach oben
        	}
   
        }
    }
    
    public static boolean spielzugBestaetiegen(char[][] spielfeld, int play) {
        if(play < 0 || play > 6 ) {
            return false;
        }
        else {
            if(spielfeld[0][play] != ' ') {
                return false;
            }
            return true;
        }
    }
    
    public static void main (String[] args) {
        char[][] spielfeld = new char[6][7];
        int player = 1;
        int runde = 1;
        boolean gewinner = false;
        
        for (int zeile = 0; zeile < spielfeld.length; zeile++){
			for (int spalte = 0; spalte < spielfeld[0].length; spalte++){
				spielfeld[zeile][spalte] = ' ';
			}
		}
        spielzug(spielfeld,player);
        

    }
} 