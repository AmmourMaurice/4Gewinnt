import java.util.Scanner;

public class VierGewinnt {
  //Spielfeld wird erzeugt
  public static void erzeugeSpielfeld(char[][] spielfeld) {
    System.out.println("");
    System.out.println(" 0 1 2 3 4 5 6");
    System.out.println("_______________");
    for (int zeile = 0; zeile < spielfeld.length; zeile++) {
      System.out.print("|");
      for (int spalte = 0; spalte < spielfeld[0].length; spalte++) {
        System.out.print(spielfeld[zeile][spalte]);
        System.out.print("|");
      }
      System.out.println();
      System.out.println("_______________");
    }
    System.out.println(" 0 1 2 3 4 5 6");
    System.out.println();
  }
  
  //Spieler wechsel
  public static void spielzug(char[][] spielfeld, int player, int runde, boolean gewinner) {
    Scanner eingabe = new Scanner(System.in);
    erzeugeSpielfeld(spielfeld);
    System.out.println("Spieler " + player + " w‰hle eine Spalte aus");
    int play = eingabe.nextInt();

    if (spielzugBestaetiegen(spielfeld, play) == true) {
      if (player == 1) {

        spielfeld[5][play] = 'X';
      } else {
        spielfeld[5][play] = 'O';
      }

      erzeugeSpielfeld(spielfeld);

    } else if (fallUnterscheidungImSpielzug(spielfeld, play) == false) {
      System.out.println("Bitte geben sie eine g¸ltige Zahl ein.");
      play = eingabe.nextInt();
      if (spielzugBestaetiegen(spielfeld, play) == true) {
        if (player != 2) {

          spielfeld[5][play] = 'X';
        } else {
          spielfeld[5][play] = 'O';

          erzeugeSpielfeld(spielfeld);

        }
      }
    } else {

      for (int reihe = spielfeld.length - 1; reihe >= 0; reihe--) {
        if (spielfeld[reihe][play] == ' ') {

          if (player == 1) {
            spielfeld[reihe][play] = 'X';
            break;

          } else {
            spielfeld[reihe][play] = 'O';
            break;
          }
        }

      }

    }
  }
  
  //Steine werden gestapelt
  public static boolean spielzugBestaetiegen(char[][] spielfeld, int play) {
    if (play < 0 || play > 6) {
      return false;
    } else {
      if (spielfeld[0][play] != ' ') {
        return false;
      }
      if (spielfeld[1][play] != ' ') {
        return false;
      }
      if (spielfeld[2][play] != ' ') {
        return false;
      }
      if (spielfeld[3][play] != ' ') {
        return false;
      }
      if (spielfeld[4][play] != ' ') {
        return false;
      }
      if (spielfeld[5][play] != ' ') {
        return false;
      }
      return true;
    }
  }
  
  //schlieﬂt eine falsche Zahl aus
  public static boolean fallUnterscheidungImSpielzug(char[][] spielfeld, int play) {
    if (play < 0 || play > 6) {
      return false;
    } else {
      return true;

    }
  }

  public static boolean gibtEsEinenGewinner(char[][] spielfeld, boolean gewinner) {
    // Horizintale Abfrage
    for (int i = 0; i <= 3; i++) {
      for (int n = 0; n < 5; n++) {
        if (spielfeld[5 - n][0 + i] == 'X' 
            && spielfeld[5 - n][1 + i] == 'X' 
            && spielfeld[5 - n][2 + i] == 'X'
            && spielfeld[5 - n][3 + i] == 'X') {

          gewinner = true;
          return gewinner;
        }
        if (spielfeld[5 - n][0 + i] == 'O' 
            && spielfeld[5 - n][1 + i] == 'O' 
            && spielfeld[5 - n][2 + i] == 'O'
            && spielfeld[5 - n][3 + i] == 'O') {

          gewinner = true;
          return gewinner;
        }
      }
    }
    // Vertikale Abfrage
    for (int i = 0; i < 2; i++) {
      for (int n = 0; n < 6; n++) {
        if (spielfeld[5 - i][0 + n] == 'X'
            && spielfeld[4 - i][0 + n] == 'X'
            && spielfeld[3 - i][0 + n] == 'X'
            && spielfeld[2 - i][0 + n] == 'X') {
          gewinner = true;
          return gewinner;
        }
        if (spielfeld[5 - i][0 + n] == 'O'
            && spielfeld[4 - i][0 + n] == 'O'
            && spielfeld[3 - i][0 + n] == 'O'
            && spielfeld[2 - i][0 + n] == 'O') {
          gewinner = true;
          return gewinner;

        }
      }

    }
    // Diagonal Abfrage
    for (int i = 0; i < 3; i++) {
      for (int n = 0; n < 4; n++) {
        if (spielfeld[5 - i][0 + n] == 'X'
            && spielfeld[4 - i][1 + n] == 'X'
            && spielfeld[3 - i][2 + n] == 'X'
            && spielfeld[2 - i][+3 + n] == 'X') {
          gewinner = true;
          return gewinner;
        }
        if (spielfeld[5 - i][0 + n] == 'O'
            && spielfeld[4 - i][1 + n] == 'O'
            && spielfeld[3 - i][2 + n] == 'O'
            && spielfeld[2 - i][+3 + n] == 'O') {
          gewinner = true;
          return gewinner;
        }

      }
    }
    // Diagonal Abfrage
    for (int i = 0; i < 3; i++) {
      for (int n = 0; n <= 2; n++) {
        if (spielfeld[5 - i][6 - n] == 'X'
            && spielfeld[4 - i][5 - n] == 'X'
            && spielfeld[3 - i][4 - n] == 'X'
            && spielfeld[2 - i][3 - n] == 'X') {
          gewinner = true;
          return gewinner;
        }
        if (spielfeld[5 - i][6 - n] == 'O'
            && spielfeld[4 - i][5 - n] == 'O'
            && spielfeld[3 - i][4 - n] == 'O'
            && spielfeld[2 - i][3 - n] == 'O') {
          gewinner = true;
          return gewinner;
        }
      }

    }
    return false;

  }

  public static void main(String[] args) {
    System.out.println("Anleitung:");
    System.out.println("Geben Sie eine Spalte an,");
    System.out.println("in die Sie ihren Stein platzieren mˆchten.");
    System.out.println("Best‰tigen Sie ihre wahl mit Enter.");
    System.out.println("Besitzen Sie 4 Steine Horizontal, Vertikal"); 
    System.out.println("oder Diagonal in einer Reihe so haben Sie gewonnen.");
    char[][] spielfeld = new char[6][7];
    int player = 1;
    int runde = 1;
    boolean gewinner = false;

    for (int zeile = 0; zeile < spielfeld.length; zeile++) {
      for (int spalte = 0; spalte < spielfeld[0].length; spalte++) {
        spielfeld[zeile][spalte] = ' ';
      }
    }
    while (gewinner == false || runde > 42) {
      spielzug(spielfeld, player, runde, gewinner);

      gewinner = gibtEsEinenGewinner(spielfeld, gewinner);

      if (player == 1) {
        player = 2;
      } else {
        player = 1;
      }

      runde++;

      if (gewinner) {
        if (player == 1) {
          erzeugeSpielfeld(spielfeld);
          System.out.println("Spieler 2 hat gewonnen.");
        } else {
          erzeugeSpielfeld(spielfeld);
          System.out.println("Spieler 1 hat gewonnen");
        }
      }
    }

  }
}