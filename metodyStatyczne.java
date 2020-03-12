public class metodyStatyczne{
    public static void main(String[] args){
        //Matematyka test = new Matematyka();
        double wynik= Matematyka.dodaj(10,20);
        System.out.println(wynik);
        System.out.println(Matematyka.PI);
        Klient a = new Klient("Arek");
        Klient b = new Klient("Marek");
        Klient c = new Klient("Wiola");
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
        System.out.println(Klient.nastepnyID);

    }
}
class Matematyka
{
    static final double PI = 3.14;
    static double dodaj(double a, double b)
    {
        return a + b;
    }
}
class Klient
{
    Klient(String imie)
    {
        this.imie=imie;
        id=nastepnyID;
        nastepnyID++;
    }
    String imie;
    int id=0;
    static int nastepnyID = 0;
}