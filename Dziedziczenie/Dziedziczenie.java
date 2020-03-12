package Dziedziczenie;
import potwory.Potwor;
import potwory.Szkielet;
import potwory.Zombie;
public class Dziedziczenie{
    public static void main(final String[] args) {
        Potwor p = new Potwor(10, 100);
        System.out.println(p.predkoscChodzenia);
        Szkielet s = new Szkielet(40, 500, "Łuk");
        Zombie z = new Zombie();
        System.out.println(s.predkoscChodzenia + " "+s.typBroni);
        s.atakuj();
        Potwor p2 = new Szkielet();
        Potwor p1 = new Zombie();
        p.atakuj();
        p2.atakuj();
        p1.atakuj();
    
    }
}