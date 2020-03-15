package ProgramKlasaAbstrakcyjnaStrumienia;
import java.io.*;
public class klasaabstrakcyjnastrumienia {
    public static void main(String[] args) throws IOException {
       
        /**
         * Tworzymy plik tekstowy do ktorego przesylamy ciag znakow za pomoca klasy writrer
         * @version 1.0
         * Połączylismy dwa strumienie BufferedWriter z FileWriter
         */
         Writer writer = new BufferedWriter(new FileWriter("plikTekstyowy.txt"));
         writer.write("lalalal");
         writer.close();
    }
}