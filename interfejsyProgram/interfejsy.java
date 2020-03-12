package interfejsyProgram;
import java.util.Arrays;

public class interfejsy 
{
    public static void main( String[] args) 
    {
        
        
        System.out.println(nazwaInterfejsu.PI);
         int[] tab = new int[4];
        tab[0]=3;
        tab[1]=2;
        tab[2]=1;
        tab[3]=4;
        Arrays.sort(tab);
        for (int i=0; i<tab.length; i++)
            System.out.println(tab[i]);

         Pracownik[] pracownik= new Pracownik[3];
        pracownik[0] = new Pracownik(10000);
        pracownik[1] = new Pracownik(3786);
        pracownik[2] = new Pracownik(2357);
        System.out.println("Przed sortowaniem: ");
        for (Pracownik p: pracownik)
        {
            System.out.println(p.getWynagrodzenie());
        }
        System.out.println("Zwracana warość przy porównywaniu pracownika 0 i pracownika 1: " + pracownik[0].compareTo(pracownik[1]));
        Arrays.sort(pracownik);
        System.out.println("Po sortowaniu: ");
        for (Pracownik p: pracownik)
        {
            System.out.println(p.getWynagrodzenie());
        }
    }
}
interface nazwaInterfejsu
{
    double PI= 3.14;

   
}

class Pracownik implements nazwaInterfejsu, Comparable
{
    Pracownik( double wynagrodzenie)
    {
        this.wynagrodzenie = wynagrodzenie;
    }


    public double wynagrodzenie;
    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
    public int compareTo(Object t)
    {

        Pracownik przyslany =(Pracownik)t;
        if (this.wynagrodzenie<przyslany.wynagrodzenie)
            return -1;
        else if (this.wynagrodzenie>przyslany.wynagrodzenie)
            return 1;
        else return 0;

    }
}
