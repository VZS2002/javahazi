import java.util.Scanner;

public class Feladat7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hányadik hónapot írjuk?");
        int szam = sc.nextInt();

        if (szam <= 2 || szam == 12) {
            System.out.println("Tél van");
        }
        else if (szam <= 5){
            System.out.println("Tavasz van");
        }
        else if (szam <= 8){
            System.out.println("Nyár van");
        }
        else if (szam <= 1){
            System.out.println("Ősz van");
        }
    }
}