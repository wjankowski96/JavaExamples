package ProgramKlasaAnonimowa;
public class KlasyAnonimowe{    
        public static void main(String[] args) 
        {
          ZachowaniePoWcisnieciu z = ()-> {
                    System.out.println("jestem z klasy anonimowej metoda akcja()");
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
            ZachowaniePoWcisnieciu2 z2 = ((int a, int b)-> 
            {
                System.out.println(a+b);
                return a+ b;
            });
            int wynik = p.dodajAkcje2(10, 15, z2);
            System.out.println(wynik);
        }
    }

    interface ZachowaniePoWcisnieciu
    {
        void akcja();
    }
    interface ZachowaniePoWcisnieciu2
    {
        int akcja2(int a, int b);
    }
    class Przycisk 
    {
        public void dodajAkcje(ZachowaniePoWcisnieciu z)
        {
            z.akcja();
        }
        public int dodajAkcje2(int a, int b, ZachowaniePoWcisnieciu2 z )
        {
            
            return z.akcja2(a, b);
        }
    }
    class Przycisk2 implements ZachowaniePoWcisnieciu
    {
        public void akcja()
        {
            System.out.println("jestem z przycisku 2");
            
        }
    }
    