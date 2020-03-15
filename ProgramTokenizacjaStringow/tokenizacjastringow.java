package ProgramTokenizacjaStringow;

import java.io.*;

public class tokenizacjastringow {
    public static void main(String[] args) {

        Towar[] towar = new Towar[3];
        towar[0] = new Towar();
        towar[1] = new Towar(34.7, "Kurs");
        towar[2] = new Towar(39.5, "Kurs C++", 2008, 11, 21);

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("bazaTowarow.txt"));
            Towar.zapiszDoPliku(towar, writer);
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("bazaTowarow.txt"));
            Towar[] towar2 = Towar.odczytajZPliku(reader);
            for(int i =0; i<towar2.length;i++)
            {
                System.out.println(towar2[i]);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}