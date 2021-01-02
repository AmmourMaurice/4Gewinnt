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
	   //Horizontale Abfrage
	   if(spielfeld[5][0] == 'X' && spielfeld[5][1] == 'X' && spielfeld[5][2] == 'X' && spielfeld[5][3] == 'X' || 
			   spielfeld[5][1] == 'X' && spielfeld[5][2] == 'X' && spielfeld[5][3] == 'X' && spielfeld[5][4] == 'X'||
			   spielfeld[5][2] == 'X' && spielfeld[5][3] == 'X' && spielfeld[5][4] == 'X' && spielfeld[5][5] == 'X'||
			   spielfeld[5][3] == 'X' && spielfeld[5][4] == 'X' && spielfeld[5][5] == 'X' && spielfeld[5][6] == 'X'||
			   spielfeld[5][0] == 'O' && spielfeld[5][1] == 'O' && spielfeld[5][2] == 'O' && spielfeld[5][3] == 'O'||
			   spielfeld[5][1] == 'O' && spielfeld[5][2] == 'O' && spielfeld[5][3] == 'O' && spielfeld[5][4] == 'O'||
			   spielfeld[5][2] == 'O' && spielfeld[5][3] == 'O' && spielfeld[5][4] == 'O' && spielfeld[5][5] == 'O'||
			   spielfeld[5][3] == 'O' && spielfeld[5][4] == 'O' && spielfeld[5][5] == 'O' && spielfeld[5][6] == 'O'||
			   
			   spielfeld[4][0] == 'X' && spielfeld[4][1] == 'X' && spielfeld[4][2] == 'X' && spielfeld[4][3] == 'X' || 
			   spielfeld[4][1] == 'X' && spielfeld[4][2] == 'X' && spielfeld[4][3] == 'X' && spielfeld[4][4] == 'X'||
			   spielfeld[4][2] == 'X' && spielfeld[4][3] == 'X' && spielfeld[4][4] == 'X' && spielfeld[4][5] == 'X'||
			   spielfeld[4][3] == 'X' && spielfeld[4][4] == 'X' && spielfeld[4][5] == 'X' && spielfeld[4][6] == 'X'||
			   spielfeld[4][0] == 'O' && spielfeld[4][1] == 'O' && spielfeld[4][2] == 'O' && spielfeld[4][3] == 'O'||
			   spielfeld[4][1] == 'O' && spielfeld[4][2] == 'O' && spielfeld[4][3] == 'O' && spielfeld[4][4] == 'O'||
			   spielfeld[4][2] == 'O' && spielfeld[4][3] == 'O' && spielfeld[4][4] == 'O' && spielfeld[4][5] == 'O'||
			   spielfeld[4][3] == 'O' && spielfeld[4][4] == 'O' && spielfeld[4][5] == 'O' && spielfeld[4][6] == 'O'||
			   
			   spielfeld[3][0] == 'X' && spielfeld[3][1] == 'X' && spielfeld[3][2] == 'X' && spielfeld[3][3] == 'X' || 
			   spielfeld[3][1] == 'X' && spielfeld[3][2] == 'X' && spielfeld[3][3] == 'X' && spielfeld[3][4] == 'X'||
			   spielfeld[3][2] == 'X' && spielfeld[3][3] == 'X' && spielfeld[3][4] == 'X' && spielfeld[3][5] == 'X'||
			   spielfeld[3][3] == 'X' && spielfeld[3][4] == 'X' && spielfeld[3][5] == 'X' && spielfeld[3][6] == 'X'||
			   spielfeld[3][0] == 'O' && spielfeld[3][1] == 'O' && spielfeld[3][2] == 'O' && spielfeld[3][3] == 'O'||
			   spielfeld[3][1] == 'O' && spielfeld[3][2] == 'O' && spielfeld[3][3] == 'O' && spielfeld[3][4] == 'O'||
			   spielfeld[3][2] == 'O' && spielfeld[3][3] == 'O' && spielfeld[3][4] == 'O' && spielfeld[3][5] == 'O'||
			   spielfeld[3][3] == 'O' && spielfeld[3][4] == 'O' && spielfeld[3][5] == 'O' && spielfeld[3][6] == 'O'||
			   
			   spielfeld[2][0] == 'X' && spielfeld[2][1] == 'X' && spielfeld[2][2] == 'X' && spielfeld[2][3] == 'X' || 
			   spielfeld[2][1] == 'X' && spielfeld[2][2] == 'X' && spielfeld[2][3] == 'X' && spielfeld[2][4] == 'X'||
			   spielfeld[2][2] == 'X' && spielfeld[2][3] == 'X' && spielfeld[2][4] == 'X' && spielfeld[2][5] == 'X'||
			   spielfeld[2][3] == 'X' && spielfeld[2][4] == 'X' && spielfeld[2][5] == 'X' && spielfeld[2][6] == 'X'||
			   spielfeld[2][0] == 'O' && spielfeld[2][1] == 'O' && spielfeld[2][2] == 'O' && spielfeld[2][3] == 'O'||
			   spielfeld[2][1] == 'O' && spielfeld[2][2] == 'O' && spielfeld[2][3] == 'O' && spielfeld[2][4] == 'O'||
			   spielfeld[2][2] == 'O' && spielfeld[2][3] == 'O' && spielfeld[2][4] == 'O' && spielfeld[2][5] == 'O'||
			   spielfeld[2][3] == 'O' && spielfeld[2][4] == 'O' && spielfeld[2][5] == 'O' && spielfeld[2][6] == 'O'||
			   
			   spielfeld[1][0] == 'X' && spielfeld[1][1] == 'X' && spielfeld[1][2] == 'X' && spielfeld[1][3] == 'X' || 
			   spielfeld[1][1] == 'X' && spielfeld[1][2] == 'X' && spielfeld[1][3] == 'X' && spielfeld[1][4] == 'X'||
			   spielfeld[1][2] == 'X' && spielfeld[1][3] == 'X' && spielfeld[1][4] == 'X' && spielfeld[1][5] == 'X'||
			   spielfeld[1][3] == 'X' && spielfeld[1][4] == 'X' && spielfeld[1][5] == 'X' && spielfeld[1][6] == 'X'||
			   spielfeld[1][0] == 'O' && spielfeld[1][1] == 'O' && spielfeld[1][2] == 'O' && spielfeld[1][3] == 'O'||
			   spielfeld[1][1] == 'O' && spielfeld[1][2] == 'O' && spielfeld[1][3] == 'O' && spielfeld[1][4] == 'O'||
			   spielfeld[1][2] == 'O' && spielfeld[1][3] == 'O' && spielfeld[1][4] == 'O' && spielfeld[1][5] == 'O'||
			   spielfeld[1][3] == 'O' && spielfeld[1][4] == 'O' && spielfeld[1][5] == 'O' && spielfeld[1][6] == 'O'||
			   
			   spielfeld[0][0] == 'X' && spielfeld[0][1] == 'X' && spielfeld[0][2] == 'X' && spielfeld[0][3] == 'X' || 
			   spielfeld[0][1] == 'X' && spielfeld[0][2] == 'X' && spielfeld[0][3] == 'X' && spielfeld[0][4] == 'X'||
			   spielfeld[0][2] == 'X' && spielfeld[0][3] == 'X' && spielfeld[0][4] == 'X' && spielfeld[0][5] == 'X'||
			   spielfeld[0][3] == 'X' && spielfeld[0][4] == 'X' && spielfeld[0][5] == 'X' && spielfeld[0][6] == 'X'||
			   spielfeld[0][0] == 'O' && spielfeld[0][1] == 'O' && spielfeld[0][2] == 'O' && spielfeld[0][3] == 'O'||
			   spielfeld[0][1] == 'O' && spielfeld[0][2] == 'O' && spielfeld[0][3] == 'O' && spielfeld[0][4] == 'O'||
			   spielfeld[0][2] == 'O' && spielfeld[0][3] == 'O' && spielfeld[0][4] == 'O' && spielfeld[0][5] == 'O'||
			   spielfeld[0][3] == 'O' && spielfeld[0][4] == 'O' && spielfeld[0][5] == 'O' && spielfeld[0][6] == 'O') {
		   gewinner = true;
		   return gewinner;
	   }
	   //Vertikale Abfrage
	   if(spielfeld[5][0] == 'X' && spielfeld[4][0] == 'X' && spielfeld[3][0] == 'X' && spielfeld[2][0] == 'X'||
			   spielfeld[4][0] == 'X' && spielfeld[3][0] == 'X' && spielfeld[2][0] == 'X' && spielfeld[1][0] == 'X'||
			   spielfeld[3][0] == 'X' && spielfeld[2][0] == 'X' && spielfeld[1][0] == 'X' && spielfeld[0][0] == 'X'||
			   spielfeld[5][0] == 'O' && spielfeld[4][0] == 'O' && spielfeld[3][0] == 'O' && spielfeld[2][0] == 'O'||
			   spielfeld[4][0] == 'O' && spielfeld[3][0] == 'O' && spielfeld[2][0] == 'O' && spielfeld[1][0] == 'O'||
			   spielfeld[3][0] == 'O' && spielfeld[2][0] == 'O' && spielfeld[1][0] == 'O' && spielfeld[0][0] == 'O'||
			   
			   spielfeld[5][1] == 'X' && spielfeld[4][1] == 'X' && spielfeld[3][1] == 'X' && spielfeld[2][1] == 'X'||
			   spielfeld[4][1] == 'X' && spielfeld[3][1] == 'X' && spielfeld[2][1] == 'X' && spielfeld[1][1] == 'X'||
			   spielfeld[3][1] == 'X' && spielfeld[2][1] == 'X' && spielfeld[1][1] == 'X' && spielfeld[0][1] == 'X'||
			   spielfeld[5][1] == 'O' && spielfeld[4][1] == 'O' && spielfeld[3][1] == 'O' && spielfeld[2][1] == 'O'||
			   spielfeld[4][1] == 'O' && spielfeld[3][1] == 'O' && spielfeld[2][1] == 'O' && spielfeld[1][1] == 'O'||
			   spielfeld[3][1] == 'O' && spielfeld[2][1] == 'O' && spielfeld[1][1] == 'O' && spielfeld[0][1] == 'O'||
			   
			   spielfeld[5][2] == 'X' && spielfeld[4][2] == 'X' && spielfeld[3][2] == 'X' && spielfeld[2][2] == 'X'||
			   spielfeld[4][2] == 'X' && spielfeld[3][2] == 'X' && spielfeld[2][2] == 'X' && spielfeld[1][2] == 'X'||
			   spielfeld[3][2] == 'X' && spielfeld[2][2] == 'X' && spielfeld[1][2] == 'X' && spielfeld[0][2] == 'X'||
			   spielfeld[5][2] == 'O' && spielfeld[4][2] == 'O' && spielfeld[3][2] == 'O' && spielfeld[2][2] == 'O'||
			   spielfeld[4][2] == 'O' && spielfeld[3][2] == 'O' && spielfeld[2][2] == 'O' && spielfeld[1][2] == 'O'||
			   spielfeld[3][2] == 'O' && spielfeld[2][2] == 'O' && spielfeld[1][2] == 'O' && spielfeld[0][2] == 'O'||
			   
			   spielfeld[5][3] == 'X' && spielfeld[4][3] == 'X' && spielfeld[3][3] == 'X' && spielfeld[2][3] == 'X'||
			   spielfeld[4][3] == 'X' && spielfeld[3][3] == 'X' && spielfeld[2][3] == 'X' && spielfeld[1][3] == 'X'||
			   spielfeld[3][3] == 'X' && spielfeld[2][3] == 'X' && spielfeld[1][3] == 'X' && spielfeld[0][3] == 'X'||
			   spielfeld[5][3] == 'O' && spielfeld[4][3] == 'O' && spielfeld[3][3] == 'O' && spielfeld[2][3] == 'O'||
			   spielfeld[4][3] == 'O' && spielfeld[3][3] == 'O' && spielfeld[2][3] == 'O' && spielfeld[1][3] == 'O'||
			   spielfeld[3][3] == 'O' && spielfeld[2][3] == 'O' && spielfeld[1][3] == 'O' && spielfeld[0][3] == 'O'||
			   
			   spielfeld[5][4] == 'X' && spielfeld[4][4] == 'X' && spielfeld[3][4] == 'X' && spielfeld[2][4] == 'X'||
			   spielfeld[4][4] == 'X' && spielfeld[3][4] == 'X' && spielfeld[2][4] == 'X' && spielfeld[1][4] == 'X'||
			   spielfeld[3][4] == 'X' && spielfeld[2][4] == 'X' && spielfeld[1][4] == 'X' && spielfeld[0][4] == 'X'||
			   spielfeld[5][4] == 'O' && spielfeld[4][4] == 'O' && spielfeld[3][4] == 'O' && spielfeld[2][4] == 'O'||
			   spielfeld[4][4] == 'O' && spielfeld[3][4] == 'O' && spielfeld[2][4] == 'O' && spielfeld[1][4] == 'O'||
			   spielfeld[3][4] == 'O' && spielfeld[2][4] == 'O' && spielfeld[1][4] == 'O' && spielfeld[0][4] == 'O'||
			   
			   spielfeld[5][5] == 'X' && spielfeld[4][5] == 'X' && spielfeld[3][5] == 'X' && spielfeld[2][5] == 'X'||
			   spielfeld[4][5] == 'X' && spielfeld[3][5] == 'X' && spielfeld[2][5] == 'X' && spielfeld[1][5] == 'X'||
			   spielfeld[3][5] == 'X' && spielfeld[2][5] == 'X' && spielfeld[1][5] == 'X' && spielfeld[0][5] == 'X'||
			   spielfeld[5][5] == 'O' && spielfeld[4][5] == 'O' && spielfeld[3][5] == 'O' && spielfeld[2][5] == 'O'||
			   spielfeld[4][5] == 'O' && spielfeld[3][5] == 'O' && spielfeld[2][5] == 'O' && spielfeld[1][5] == 'O'||
			   spielfeld[3][5] == 'O' && spielfeld[2][5] == 'O' && spielfeld[1][5] == 'O' && spielfeld[0][5] == 'O'||
			   
			   spielfeld[5][6] == 'X' && spielfeld[4][6] == 'X' && spielfeld[3][6] == 'X' && spielfeld[2][6] == 'X'||
			   spielfeld[4][6] == 'X' && spielfeld[3][6] == 'X' && spielfeld[2][6] == 'X' && spielfeld[1][6] == 'X'||
			   spielfeld[3][6] == 'X' && spielfeld[2][6] == 'X' && spielfeld[1][6] == 'X' && spielfeld[0][6] == 'X'||
			   spielfeld[5][6] == 'O' && spielfeld[4][6] == 'O' && spielfeld[3][6] == 'O' && spielfeld[2][6] == 'O'||
			   spielfeld[4][6] == 'O' && spielfeld[3][6] == 'O' && spielfeld[2][6] == 'O' && spielfeld[1][6] == 'O'||
			   spielfeld[3][6] == 'O' && spielfeld[2][6] == 'O' && spielfeld[1][6] == 'O' && spielfeld[0][6] == 'O') {
		   gewinner = true;
		   return gewinner;
		   // Spielfeld muss erneut bei vertikal ausgegeben werden, da es so ausieht als hätte man mit 3 Steinen Vertikal gewonnen
	   }
		   
	    
	   
	   
	   
	   
	   
	   
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