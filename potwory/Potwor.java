package potwory;
public abstract class Potwor{
    public double predkoscChodzenia =10;
    public double zywotnosc;
    public void atakuj()
    {
        System.out.println("metoda ataku z klasy potwor");
    }
    public Potwor()
    {
        System.out.println("Domyślny konstruktor z klasy potwór");
    }
    public Potwor(double predkoscChodzenia, double zywotnosc)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("Nie domyślny konstruktor z klasy potwór");

    }
    abstract protected void opis();

}