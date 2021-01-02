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
    public static void spielzug(char[][] spielfeld,int player, int runde, boolean gewinner) {
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
        
        
        
        }else        if (fallUnterscheidungImSpielzug(spielfeld, play)==false ) {
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
        			}else{
        				
        				for (int reihe = spielfeld.length-1; reihe >= 0; reihe--){
        					if(spielfeld[reihe][play] == ' '){
        						
        						if (player==1) {
        							spielfeld[reihe][play] = 'X';
        							break;
        							
        						}else {       						
        							spielfeld[reihe][play] = 'O';
        							break;
        							}
        						}
        						
        				}

        			}
        	}
      
    public static boolean spielzugBestaetiegen(char[][] spielfeld, int play ) {
    	if(play < 0 || play > 6 ) {	
    		return false;
        }
        else {
            if(spielfeld[0][play] != ' ') {	
            	return false;
            }
            if(spielfeld[1][play] != ' ') {	
            	return false;
            }
            if(spielfeld[2][play] != ' ') {	
            	return false;
            }
            if(spielfeld[3][play] != ' ') {	
            	return false;
            }
            if(spielfeld[4][play] != ' ') {	
            	return false;
            }
            if(spielfeld[5][play] != ' ') {	
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
    
    
   public static boolean gibtEsEinenGewinner (char[][] spielfeld,boolean gewinner) {
	   if (spielfeld[5][0]=='X' & spielfeld[5][1]=='X') {
		   gewinner=true;
		   return gewinner;
	   }else{
		   gewinner=false;
		   return gewinner;
	   }
	   //return gewinner;
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
        spielzug(spielfeld,player, runde, gewinner);
        
        
        gewinner=gibtEsEinenGewinner(spielfeld,gewinner);
        
        if (player == 1){
			player = 2;
		}else{
			player = 1;
		}
		
		runde++;
		
		if (gewinner) {
			System.out.println("Du hast gewonnen.");
		}
        }
        
    }
} 