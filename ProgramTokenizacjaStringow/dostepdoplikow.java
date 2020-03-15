package ProgramTokenizacjaStringow;

import java.io.*;

public class dostepdoplikow {
    TowarRAF[] towar = new TowarRAF[3];
        
    towar[0] = new TowarRAF();
    towar[1] = new TowarRAF(29.0, "Video Kurs Java");
    towar[2] = new TowarRAF(39.0, "Video Kurs C++", 2008, 11, 21);
    
    try
    {           
       RandomAccessFile RAF = new RandomAccessFile("baza.txt", "rw");
       
       TowarRAF.zapiszDoPliku(towar, RAF);
       RAF.seek(0);
       
       TowarRAF[] towarki = TowarRAF.odczytajZPliku(RAF);
       
       for (int i = 0; i < towarki.length; i++)
       {
           System.out.println(towarki[i].pobierzCene());
           System.out.println(towarki[i].pobierzNazwe());
           System.out.println(towarki[i].pobierzDate());
           System.out.println("-----------------------");
       }
       
      /* int n = 2;
       RAF.seek((n-1)*TowarRAF.DLUGOSC_REKORDU);
       
       TowarRAF a = new TowarRAF();
       a.czytajDane(RAF);
       
       System.out.println(a);
       */
       try
       {
           TowarRAF b = new TowarRAF();

           b.czytajRekord(RAF, 3);
           System.out.println(b);

           System.out.println("lala");
       }
       catch(BrakRekordu err)
       {
           System.out.println(err.getMessage());
       }
       RAF.close();
    }
    catch (IOException e)
    {
        System.out.println(e.getMessage());
    }
}
}



    