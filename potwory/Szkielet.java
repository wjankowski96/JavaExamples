package potwory;
public class Szkielet extends Potwor{

    public String typBroni;
	public Szkielet() {
        System.out.println("Domyślny konstruktor z klasy szkielet");
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni)
    {
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
        System.out.println("Nie domyślny konstruktor z klasy szkielet");
    }
    public void atakuj()
    {
        super.atakuj();
        System.out.println("metoda ataku z klasy szkielet");
    }
    protected void opis()
    {

    }

}