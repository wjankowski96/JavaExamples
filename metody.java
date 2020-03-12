public class metody{
    public static void main(String[] args){
        Test a = new Test();
        a.wypisz("Wojtek");
        double wynik= a.dodaj(10.34,20.86);
        
        System.out.println(wynik);

        double wynik1= a.dzielenie(10.0,20.0);
        System.out.println(wynik1);
    }
}
class Test
{
    void wypisz(String imie)
    {
        System.out.println(imie);
    }
    int dodaj(int a,int b)
    {
        return a+b;
    }
    double dodaj(double a,double b)
    {
        return a+b;
    }
    double dzielenie(double a, double b)
    {
        if (b==0)
            return 0;
        return a/b;
    }
}