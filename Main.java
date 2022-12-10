package com.company;
import java.lang.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int n;
        String s,n2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Doriti sa jucati \"Guess the number\"?Trebuie sa ghiciti un numar intre 0 si 1000 din maximum" +
        " 10 incercari,primind pe parcurs indicatii de genul \"prea mic\",\"prea mare\" sau \"ati ghicit!\"");
        s=scan.nextLine();
        if(s.equalsIgnoreCase("da")) {
            System.out.print("Cu ce suma intrati in joc($)?");
            n2 = scan.nextLine();
            n = Integer.parseInt(n2);
            ruleta ob = new ruleta(n);
            ob.FRAMEWORK();
            ob.JOC();
        }
        else {
            System.err.println("Ne pare rau,am fi avut un joc pe cinste! xD");
        }
    }
}