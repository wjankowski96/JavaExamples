package ProgramKatalogi;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class katalogi {
    public static void main(String[] args) {
        try 
        {
            /**
             * Tworzymy katalog z 2 podfolderami
             */
            File katalog = new File("cos"+File.separator+"php"+File.separator+"mysql");
            katalog.isDirectory();
            katalog.mkdirs();
            /**
             * Tworzymy katalog z 2 podkatalogami i plikiem lekcja.txt w ostatnim katalogu
             */
            File plik2 = new File("cos"+File.separator+"php"+File.separator+"mysql", "lekcja1.txt");
            if (!plik2.exists())
                plik2.createNewFile();
            /**
             * Tworzymy plik o naziw text.txt i sprawdzamy czy istnieje, jesli nie przechwytujemy wyjatek
             */
            File plik = new File("test.txt");
            if (!plik.exists())
            {
                    plik.createNewFile();
            } 
            /**
             * Pobieranie sciezki 3 spospby
             */
            System.out.println("----------------");
            System.out.println(plik.getPath());
            System.out.println(plik.getAbsolutePath());
            System.out.println(plik.getCanonicalPath());
            System.out.println("----------------");
            /**
             * Sprawdzamy rózne własciwosci pliku
             */
            System.out.println("Czy mogę pisać? : " + plik.canWrite());
            System.out.println("Czy mogę wykonać? : " + plik.canExecute());
            System.out.println("Czy mogę czytać? : " + plik.canRead());
            System.out.println("Czy jest ukryty? : " + plik.isHidden());
            System.out.println("Czy jest plikiem? : " + plik.isFile());
            System.out.println("Ostatnia modyfikacja? : " + new Date(plik.lastModified()));
            System.out.println("Długość plików w bajtach ? : " + plik.length());
            //plik.delete();
            System.out.println("----------------");
            wypiszWszystkieSciezki(new File(System.getProperty("user.dir")));
            System.out.println("----------------");
        }
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }

        
        /**
         * Wypisujemy ściezke gdzie zainstalowana jest nasza java
         */
        System.out.println(System.getProperty("java.home"));        
        }

        static void wypiszWszystkieSciezki(File nazwySciezki)
        {
            String[] nazwyPlikowiKatalogow = nazwySciezki.list();
            System.out.println(nazwySciezki.getPath());
            for(int i =0; i<nazwyPlikowiKatalogow.length; i++)
            {
                File p = new File(nazwySciezki.getPath(), nazwyPlikowiKatalogow[i]);
                //if(p.isFile())
                
                System.out.println(p.getPath());
                if(p.isDirectory()){
                    System.out.println(p.getPath());
                    wypiszWszystkieSciezki(new File(p.getPath()));
                }
            }
            
        }
    }
