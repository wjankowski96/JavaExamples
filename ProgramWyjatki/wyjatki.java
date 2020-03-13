package ProgramWyjatki;



public class wyjatki{    
        public static void main(String[] args) 
        {
           /* try{
                System.out.println(5/0);
            }
            catch(ArithmeticException exception)
            {
                System.out.println("Powstał wyjątek: " + exception.getMessage());
            }
            finally
            {
                System.out.println("Zawsze zostanie wywołana ta instrukcja");
            }
*/
            

            int a= 100;
            try{
            if (a ==10)
                throw new NaszWyjatek("A jest rowne 10, grzeszysz");
            }
            catch(NaszWyjatek exception)
            {
                System.out.println("WTF " + exception.getMessage());
            }
            finally{
                System.out.println(5/1);
            }
            
        }

    }
    class NaszWyjatek extends Exception
        {

        public NaszWyjatek(String string)
            {
                super(string);
            }
        } 
