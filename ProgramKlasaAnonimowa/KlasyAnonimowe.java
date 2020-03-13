package ProgramKlasaAnonimowa;
public class KlasyAnonimowe{    
        public static void main(String[] args) 
        {
          ZachowaniePoWcisnieciu z = new ZachowaniePoWcisnieciu()
            {
                public void akcja()
                {
                    System.out.println("jestem z klasy anonimowej metoda akcja()");
                }
            };
            z.akcja();
            Przycisk p = new Przycisk();

            p.dodajAkcje(new ZachowaniePoWcisnieciu(){
                public void akcja()
                {
                    System.out.println("jestem z klasy anonimowej metoda dodajAkcje()");
                }
            }
            );
            
        }
    }

    interface ZachowaniePoWcisnieciu
    {
        void akcja();
    }
    class Przycisk 
    {
        public void dodajAkcje(ZachowaniePoWcisnieciu z)
        {
            z.akcja();
        }
    }
    class Przycisk2 implements ZachowaniePoWcisnieciu
    {
        public void akcja()
        {
            System.out.println("jestem z przycisku 2");
        }
    }
    