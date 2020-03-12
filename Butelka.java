public class Butelka{
    private double ileLitrow;
    private double pojemnosc;
    Butelka(double ileLitrow, double pojemnosc){
        this.ileLitrow=ileLitrow;
    }
    double getIleLitrow()
    {
        return ileLitrow;
    }
    double getJakaPojemnosc()
    {
        return pojemnosc;
    }
    boolean wlej(double ilosc,double pojemnosc)
    {
        if (ilosc<ilosc+pojemnosc)
        {
            this.ileLitrow +=ilosc;
        }else
            return false;
        return true;
        
    }
    boolean wylej(double ilosc)
    {
        if (ilosc<ileLitrow)
            this.ileLitrow-=ilosc;
        else 
            return false;
        return true;

    }
    void przelej(double ilosc, Butelka gdziePrzelac)
    {
       if (this.wylej(ilosc))
            gdziePrzelac.wlej(ilosc,pojemnosc);
        else
            System.out.println("za maloo");
    }
    public static void main(String[] args){
        Butelka[] butelka = new Butelka[3];
        for (int i=0; i<3; i++)
            butelka[i]=new Butelka(0.1,1);
        System.out.println("W butelce jest "+butelka[0].getIleLitrow()+"litrow");
        butelka[0].wlej(2,5);
        System.out.println("W butelce jest "+butelka[0].getIleLitrow()+"litrow");
        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());
        butelka[0].przelej(1, butelka[1]);
        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());

        
    }
}
