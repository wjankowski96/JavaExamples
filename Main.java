
public class Main{
    public static void main(final String[] args) {
        Osoba[] osoba = new Osoba[4] ;
        osoba[0] = new Pracownik("Wojciech", "Jankowski", 10000);
        osoba[1] = new Student("Kamil", "Walczyk");
        osoba[2] = new Pracownik("Joanna", "Ochlast", 10000);
        //osoba[0].pobierzOpis();
        //osoba[1].pobierzOpis();
        for (Osoba person: osoba)
        {
            if(person instanceof Pracownik)
            {
                Pracownik tmp = (Pracownik)person;
                tmp.pobierzOpis();
            }
            if(person instanceof Student)
            {
                Student tmp = (Student)person;
                tmp.pobierzOpis();
            }
        }
    }
}
abstract class Osoba
{
    String imie;
    String nazwisko;
    Osoba(String imie, String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    abstract void pobierzOpis();

}
class Pracownik extends Osoba
{
    double wynagrodzenie;
    Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        super(imie,nazwisko);
        this.wynagrodzenie= wynagrodzenie;
    }
    void pobierzOpis()
    {
        System.out.println("Jestem studentem");
        System.out.println("Moje imie: " + imie);
        System.out.println("Moje nazwisko: " + nazwisko);
        System.out.println("Moje wynagrodzenie: " + wynagrodzenie);
    }
    void pracuj()
    {

    }
}
class Student extends Osoba
{
    Student(String imie, String nazwisko)
    {
        super(imie, nazwisko);
    }
    void pobierzOpis()
    {
        System.out.println("Jestem studentem");
        System.out.println("Moje imie: " + imie);
        System.out.println("Moje nazwisko: " + nazwisko);
    }
}