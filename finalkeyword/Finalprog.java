package finalkeyword;

import java.util.Date;

public class Finalprog 
{
    public static void main(String[] args) 
    {
        final double PI;
        
        PI = 3.14;
        
        Pracownik p = new Pracownik();
        
        System.out.println(p.dataZatrudnienia);
        
        
    }
    
}

abstract class Osoba
{

}

class Pracownik extends Osoba
{
    Pracownik()
    {
        this.dataZatrudnienia = new Date();
    }
    Pracownik(Date data)
    {
        this.dataZatrudnienia = data;
    }
    
    final Date getDataZatrudnienia()
    {
        return this.dataZatrudnienia;
    }
    final Date dataZatrudnienia;
}
class Programista extends Pracownik
{
  
}
