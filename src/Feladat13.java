import java.util.Random;
import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {

        double szam = Math.random()*100+1;
        int talalat;
        double szam2 = (int) szam;
        System.out.println("Gondoltam egy számra 1-100 között!");
        Scanner sc = new Scanner(System.in);
        talalat=sc.nextInt();
        do {

            if (talalat<szam2)
            {
                System.out.println("Ennél nagyobb.");
                talalat=sc.nextInt();
            }
            else if (talalat>szam2){
                System.out.println("Ennél kisebb.");
                talalat=sc.nextInt();
            }

        }
        while (talalat!=szam2);



    }
}
