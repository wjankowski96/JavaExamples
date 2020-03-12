public class enkapsulacja{
    public static void main(String[] args){
        KontoBankowe oszczednosciowe = new KontoBankowe();
        if (oszczednosciowe.wyplata(40))
        {
            System.out.println("wyplacono");
        }else
        System.out.println("za malo kasy");
      // oszczednosciowe.setSaldo(1000000);
        System.out.println(oszczednosciowe.getSaldo());
        oszczednosciowe.wplac(60);
        System.out.println(oszczednosciowe.getSaldo());
    }
}
class KontoBankowe 
{
    public KontoBankowe()
    {
          saldo=100;
    }

    private int saldo;

     int getSaldo()
     {
         return saldo;
     }
     void setSaldo(int saldo)
     {
         this.saldo = saldo;
     }
     boolean wyplata(int ile)
     {
         if(saldo <ile)
            return false;
            else
            setSaldo(saldo - ile);
         return true;
     }
     boolean wplac(int ile)
     {
         setSaldo(saldo+ile);
         return true;
     }
}