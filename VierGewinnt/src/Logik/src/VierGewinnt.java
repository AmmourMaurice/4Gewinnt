import java.util.Scanner;
public class VierGewinnt{


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
    public static void spielzug(char[][] spielfeld,int player, int runde) {
        Scanner eingabe = new Scanner(System.in);
        erzeugeSpielfeld(spielfeld);
        System.out.println("Spieler " + player + " wähle eine Spalte aus");
        int play = eingabe.nextInt();
        
        if (spielzugBestaetiegen(spielfeld, play) == true) {
        if (player ==1) {
        	
        	spielfeld[5][play] = 'X';
        }else { spielfeld[5][play] = 'O';
        }
        erzeugeSpielfeld(spielfeld);
        
        	}
        
        else {
        		if (fallUnterscheidungImSpielzug(spielfeld, play)==false ) {
        			//while ((spielzugBestaetiegen(spielfeld, play)) == false){
        			System.out.println("Bitte geben sie eine gültige Zahl ein.");
        			play = eingabe.nextInt();
        			 if (spielzugBestaetiegen(spielfeld, play) == true) {
        				 if (player ==1) {
        			        	
        			        	spielfeld[5][play] = 'X';
        			        }else { spielfeld[5][play] = 'O';
        			       
        			        erzeugeSpielfeld(spielfeld);
        			        
        			        }
        			 	}
        		//	}	
        			
        		}else 
        	{
        			while ((spielzugBestaetiegen(spielfeld, play)) == true){
        					int i =1;
        					if (player ==1) {
        			        	
        			        	spielfeld[5-i][play] = 'X';
        			        }else { spielfeld[5-i][play] = 'O';
        			       
        			        erzeugeSpielfeld(spielfeld);
        			        i++;
        				}
        			}
        		}
        	}
        }
        
        		 		
    		
        	
        	
        	 //Abfrage welche der beiden Bedingungen falsch ist und dann entweder Wiederholung oder Korrektur nach oben
        	
   
        
    
    
    public static boolean spielzugBestaetiegen(char[][] spielfeld, int play ) {
    	if(play < 0 || play > 6 ) {	
    		return false;
        }
        else {
            if(spielfeld[0][play] == ' ') {	
            	return false;
            }
            return true;
        }
    }
    
    
    public static boolean fallUnterscheidungImSpielzug (char[][] spielfeld, int play) {
    	if(play < 0 || play > 6 ) {	
    		return false;
        }
        else {
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
        while (gewinner == false || runde>42) {       	        
        spielzug(spielfeld,player, runde);
       
        
        if (player == 1){
			player = 2;
		}else{
			player = 1;
		}
		
		runde++;
        }

    }
} 