package ProgramKlasaAbstrakcyjnaStrumienia;
import java.io.*;
public class klasaabstrakcyjnastrumienia {
    public static void main(String[] args) throws IOException {
       
        /**
         * @version 1.1
         * Tworzymy plik tekstowy do ktorego przesylamy ciag znakow za pomoca klasy writrer
         * Połączylismy dwa strumienie BufferedWriter(klasa abstrakcyjna) z FileWriter
         * Zapisywanie szybciej bo dane sa bufforowane i otrzymalismy mozliwosc dodawania nowej lini
         */
        File plik = new File("plikTekstyowy.txt");
         Reader reader;
         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(plik)));
         writer.write("lalalal");
         writer.newLine();
         writer.write("nastepna linia");
         writer.close();

         
        // Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(plikTekstyowy)));
    }
}