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
         BufferedWriter writer = new BufferedWriter(new FileWriter("plikTekstyowy.txt"));
         writer.write("lalalal");
         writer.newLine();
         writer.write("nastepna linia");
         writer.close();

    }
}