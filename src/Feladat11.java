import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy pozitív egész számot!");
        int szam = sc.nextInt();
        int osszeg=0;

        for (int i = szam; i > 0; i--) {
            if (i % 2 != 0) {
              osszeg+=i;
            }
        }
        System.out.println("A számnál nem nagyobb páratlan számok összege:" + osszeg);
    }
}
