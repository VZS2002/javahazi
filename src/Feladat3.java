import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy pozitív valós számot");
        double szam = sc.nextDouble();
        int egesz = (int) szam;
        double tizedes = szam-egesz;
        double utana = Math.ceil(szam);
        double elotte = Math.floor(szam);
        double kozelebb;
        if ((elotte-szam)*-1<utana-szam)
        {
            kozelebb=elotte;
        }
        else{
            kozelebb=utana;
        }
        System.out.printf("A megadott szám a %f és a %f egész számok között van, és ezek közül a %f számhoz van közelebb. \n A szám egész része %d \n A szám tizedes része %f",elotte, utana, kozelebb, egesz, tizedes);

    }
}
