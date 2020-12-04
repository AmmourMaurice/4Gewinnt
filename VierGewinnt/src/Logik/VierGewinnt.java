package Logik;
import java.util.Scanner;
public class VierGewinnt{

    public static void gamefield(char[][] spielfeld){
        System.out.println("");
        System.out.println(" 1 2 3 4 5 6 7");
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
        System.out.println(" 1 2 3 4 5 6 7");
        System.out.println();

    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] spielfeld = new char[6][7];

        for (int reihe = 0; reihe < spielfeld.length; reihe++){
            for (int strich = 0; strich < spielfeld[0].length; strich++){
                spielfeld[reihe][strich] = ' ';
            }
        }
        gamefield(spielfeld);
    }
}
