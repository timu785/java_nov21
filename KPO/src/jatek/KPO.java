package jatek;

import java.util.Scanner;

public class KPO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ko, papir vagy ollo: ");
        String input = scanner.nextLine();
        input = input.trim();
        
        while(!input.equals("ko") && !input.equals("papir") && !input.equals("ollo")) {
            System.out.println("HIBA!  ko, papir vagy ollo: ");
            input = scanner.nextLine();
            input = input.trim();
        }
        
        String gep = "semmi";
        int geprandom = (int)(Math.random() * 3) + 1;
        /*
        itt lehetne úgy tesztelni a kódot, hogy a randomszámgenerálás után,
        szándékosan beállítjuk egy tesztelendő számra az értékét, és így azzal
        dolgozik tovább a program.
        
        Például:
        geprandom = 1;
        
        */
        if(geprandom == 1) {gep = "ko";}
        if(geprandom == 2) {gep = "papir";}
        if(geprandom == 3) {gep = "ollo";}
        System.out.println("A gep valasztasa: ");
        System.out.println(gep);
        
        if(input.equals(gep)) {
            System.out.println("Dontetlen!");
        }        
        if(input.equals("ko") && gep.equals("ollo")) {
            System.out.println("On nyert!");
        }
        if(input.equals("papir") && gep.equals("ko")) {
            System.out.println("On nyert!");
        }
        if(input.equals("ollo") && gep.equals("papir")) {
            System.out.println("On nyert!");
        }
        if(input.equals("ko") && gep.equals("papir")) {
            System.out.println("On vesztett!");
        }
        if(input.equals("papir") && gep.equals("ollo")) {
            System.out.println("On vesztett!");
        }
        if(input.equals("ollo") && gep.equals("ko")) {
            System.out.println("On vesztett!");
        }
        
    }
}
