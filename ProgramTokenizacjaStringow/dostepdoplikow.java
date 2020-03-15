package ProgramTokenizacjaStringow;

import java.io.*;

public class dostepdoplikow {
    public static void main(String[] args) {

        Towar[] towar = new Towar[3];
        towar[0] = new Towar();
        towar[1] = new Towar(34.7, "Kurs");
        towar[2] = new Towar(39.5, "Kurs C++", 2008, 11, 21);

        try {
           
            /*DataOutputStream outS = new DataOutputStream (new FileOutputStream("nowyPlik.txt"));
            outS.writeDouble(12123);
            outS.close();
            DataInputStream inS = new DataInputStream(new FileInputStream("nowyPlik.txt"));
            System.out.println(inS.readDouble());
            inS.close();
            */
            /**
             * Swobodny dostep do pliku
             * r read
             * w write
             */
            RandomAccessFile RAF = new RandomAccessFile("nowyRAF.txt", "rw");
            RAF.writeDouble(123.45);
            RAF.writeDouble(41.87);
            RAF.writeChars("hulahop");

            System.out.println(RAF.getFilePointer());
            RAF.seek(8);//poruszamy sie poprzez zmiane wartosci o ilosc bajtow
            System.out.println(RAF.readDouble());
            System.out.println(Double.SIZE/8);

            RAF.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}