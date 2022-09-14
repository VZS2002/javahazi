package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a téglalap a oldalát: ");
        double a = sc.nextDouble();
        System.out.print("Kérem adja meg a téglalap b oldalát: ");
        double b = sc.nextDouble();
        System.out.print("Kérem adja meg, hogy mit szeretne kiszámítani (K, T): ");
        String valasz = sc.next();
        if (valasz.equals("K")){
            System.out.println((a+b)*2);
        }
        else if (valasz.equals("T")){
            System.out.println(a*b);
        }
        else {
            System.out.println("Hibás");
    }
     if (a==b){
         System.out.println("Ez egy negyzet");
     }
}
}
