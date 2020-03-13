package ProgramAgregacja;
public class agregacja{    
        public static void main(String[] args) 
        {
            //Pracownik p = new Pracownik("Arek", new Adres("Piekna", 93), new Praca("aptekarz", true));
            //System.out.println(p);
            
            Pracownik [] p = new Pracownik[3];
            p[0] = new Pracownik("Arek", new Adres("Piekna", 93), new Praca("aptekarz", true));
            p[1] = new Pracownik("Marek", new Adres("Brzydka", 22), new Praca("piekarz", false));
            p[2] = new Pracownik("Darek", new Adres("Optymalna", 69), new Praca("programista", true));

            for (Pracownik prac: p)
            {
                System.out.println(prac);
            }
        }
    }
    class Pracownik
    {
        String imie;
        Adres adres;
        Praca praca;
        
        public Pracownik(String imie, Adres adres, Praca praca)
        {
            this.imie = imie;
            this.adres = adres;
            this.praca = praca;
        }
        public String toString()
        {
            return this.imie + " : " + adres.ulica + " " + adres.nrDomu + ", stanowisko: " + praca.stanowisko + ", czy pracuje: " + praca.czyPracuje;
        }
    }
    class Adres
    {
        String ulica;
        int nrDomu;

        public Adres(String ulica, int nrDomu)
        {
            this.ulica = ulica;
            this.nrDomu = nrDomu;
        }
    }
    class Praca
    {
        String stanowisko;
        boolean czyPracuje;

        public Praca(String stanowisko, boolean czyPracuje)
        {
            this.stanowisko = stanowisko;
            this.czyPracuje = czyPracuje;
        }
    }