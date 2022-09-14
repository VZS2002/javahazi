package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy magassagot meterben!");
        double magassag = sc.nextDouble();
        System.out.println("Adj meg egy szelesseget meterben!");
        double szelesseg = sc.nextDouble();
        double terulet=magassag*szelesseg*0.9;
        double csempe=terulet/0.04;
        System.out.println("Ennyi csempére van szükség: " + csempe);

    }
}
