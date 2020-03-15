package ProgramKlasaAbstrakcyjnaStrumienia;

import java.io.*;

public class zapisodczyt {
    public static void main(String[] args) {

        try {
            PrintWriter drukarz = new PrintWriter(new FileWriter("dane.txt"));
            drukarz.println(1234);
            drukarz.close();

        /**
         * metoda append dołącza do końca pliku (po jego uprzednim zamknieciu przez close()) dodsatkowe dane 
         * metoda printf formatuje nam tekst
         * %d od digit liczba
         * %f od float zmiennoprzecinkowa liczba
         * %.2f określa ile miejsc po przecinku
         * %s od string czyli zwyczajny tekst
         */
            drukarz = new PrintWriter(new FileWriter("dane.txt"));
            drukarz.append("lalalal");
            drukarz.println();
            drukarz.printf("On wazy %d, ma %.2f %s ", 50, 1.80, "wzrostu");
            drukarz.close();



        /**
         * odcztywanie z pliku dopki nie trafimy na null
         * */   

        BufferedReader reader = new BufferedReader(new FileReader("dane.txt"));
           /* System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());*/
        BufferedWriter writer = new BufferedWriter(new FileWriter("baza.txt"));

            String tresc= "";
            while ((tresc = reader.readLine()) != null)
            {
                //System.out.println(tresc); 
                writer.write(tresc);   
                writer.newLine();
            }        
        writer.close();
        reader.close();

        } catch (IOException e) {
         System.out.println(e.getMessage());
        }
        //test(1,2,3,125,"lalala");
        

    }
    static void test(Object...a)
    {
        for(int i=0; i< a.length; i++)
            System.out.println(a[i]);
    }
}