package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int osszeg = 0;
        int paros=0;
        int paratlan=0;
        while(osszeg<=100) {
            System.out.println("Adj meg egy egész számot");
            int szam = sc.nextInt();
            osszeg+=szam;
            if (szam%2==0){
                paros++;
            }
            else{
                paratlan++;
            }
        }
        System.out.printf("Paros: %d Paratlan: %d", paros, paratlan) ;
    }
}
