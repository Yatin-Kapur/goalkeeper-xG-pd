/* Yatin Kapur
 * xg/point dropped for goalkeepers */

import java.util.Scanner;

public class gkxg {
    public static void main (String [] Args) {

        String gk;      // goalkeeper name

        float played = 0;         // games played
        float won = 0;        // games won
        float lost = 0;       // games lost
        float drawn = 0;        // games drawn

        float pointsDropped = 0;        // points dropped

        float xg = 0;       // xg faced

        float ratio = 0;        // xg per point dropped = xg/points dropped
        
        boolean yes = true;         // for loop to work

        System.out.println("Enter the goalkeeper's name:");
        Scanner input = new Scanner(System.in);        // goalkeeper name input
        gk = input.nextLine();
       
        while (yes == true) {       // loop to make sure that games add up

            System.out.println("Enter the number of games " + gk + " played:");
            input = new Scanner(System.in);         // games played input
            played = input.nextFloat();

            System.out.println("Enter the number of games " + gk + " won:");
            input = new Scanner(System.in);         // games won input
            won = input.nextFloat();

            System.out.println("Enter the number of games " + gk + " lost:");
            input = new Scanner(System.in);         // games lost input
            lost = input.nextFloat();

            System.out.println("Enter the number of games " + gk + " drew:");
            input = new Scanner(System.in);         // games drawn input
            drawn = input.nextFloat();

            float total = won + lost + drawn;        // number of games checker    
            if (total == played) {
                yes = false;        // so that loop can exit
            } else if (total != played) {
                System.out.println("Games do not add up, please enter input again.");
                yes = true;         // so loop runs again for actual good input
            }
        }

        System.out.println("Enter the expected goals sum (xG sum) " + gk + " faced over " + played + " games:");
        input = new Scanner(System.in);         // xG input
        xg = input.nextFloat();

        pointsDropped = (lost * 3) + (drawn * 1);       // calculating points dropped
        ratio = xg / pointsDropped;         // calculating ratio

        System.out.println(gk + " has an xG/Points Dropped Ratio of: " + ratio);         // ratio output
        
    }
}
