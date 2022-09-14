package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feldat1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adje meg a medence átmérőjét: ");
        double atmero = sc.nextDouble();
        System.out.println("Kérem adje meg a medence magasságát: ");
        double magassag = sc.nextDouble();
        double sugar = atmero/2;
        double alapT= sugar * sugar * Math.PI;
        double terfogat= alapT*magassag;
        System.out.printf("A medence térfogata %.3f köbméter", terfogat);
    }
}
