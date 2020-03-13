public class klasyWewnetrzne{
    public static void main(String[] args){

        A zewnetrzna = new A();
        A.B tmp1 = zewnetrzna.new B();
        A.C tmp2 = new A.C();
        zewnetrzna.wypisz();
        tmp1.pobierzZklasyA();
        tmp1.wypisz();
        zewnetrzna.wypisz();
    }
}
class A
{
    A()
    {
        System.out.println("Jestem z klasy zewnetrznej");
    }
    private int test;
    class B
    {
        B()
        {
            System.out.println("Jetsem z klasy zagniezdzonej B");
        }       
        
        void pobierzZklasyA()
        {
            test = 5;
        } 
        public void wypisz()
        {
            System.out.println("Wartosc dla klasy B: " + test);
        }
    }
    public void wypisz()
        {
            System.out.println("Wartosc dla klasy A: " + test);
        }
    static class C
    {
        C()
        {
            System.out.println("Jestem z klasy zewnetrzna C");
        }
    }
}