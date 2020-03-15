package ProgramKlasaAbstrakcyjnaStrumienia;
import java.io.*;
public class klasaabstrakcyjnastrumienia {
    public static void main(String[] args) throws IOException {
       
        /**
         * Tworzymy plik tekstowy do ktorego przesylamy ciag znakow za pomoca klasy writrer
         */
         Writer writer = new FileWriter("plikTekstyowy.txt");
         writer.write("lalalal");
         writer.close();
    }
}