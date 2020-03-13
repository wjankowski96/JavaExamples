class ZaMaloWody extends Exception
{
    public ZaMaloWody(String string)
    {
        super(string);
    }
}
public class Butelka {
    private double ileLitrow;
    private double pojemnosc;

    Butelka(double ileLitrow, double pojemnosc) {
        this.ileLitrow = ileLitrow;
    }

    double getIleLitrow() {
        return ileLitrow;
    }

    double getJakaPojemnosc() {
        return pojemnosc;
    }

    boolean wlej(double ilosc, double pojemnosc) {
        if (ilosc < ilosc + pojemnosc) {
            this.ileLitrow += ilosc;
        } else
            return false;
        return true;

    }

    void wylej(double ilosc) throws ZaMaloWody {
        if (ilosc < ileLitrow)
            this.ileLitrow -= ilosc;
        else
            throw new ZaMaloWody("Za malo wody");

    }

    void przelej(double ilosc, Butelka gdziePrzelac) throws ZaMaloWody {
        this.wylej(ilosc);
        gdziePrzelac.wlej(ilosc, pojemnosc);

    }

    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[3];
        for (int i = 0; i < 3; i++)
            butelka[i] = new Butelka(0.1, 1);
        System.out.println("W butelce jest " + butelka[0].getIleLitrow() + "litrow");
        butelka[0].wlej(2, 5);
        System.out.println("W butelce jest " + butelka[0].getIleLitrow() + "litrow");
        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());
        try {
            butelka[0].przelej(1, butelka[1]);
        } catch (ZaMaloWody e1) {
            e1.printStackTrace();
            e1.getMessage();
        }
        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());

        Butelka k = new Butelka(5, 6);
        Butelka k2 = new Butelka(5, 6);
        try {
            k.przelej(20, k2);
        } catch (ZaMaloWody e) {
            e.printStackTrace();
            e.getMessage();
        }
        
    }
}
