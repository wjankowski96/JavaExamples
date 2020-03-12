public class This{
    public static void main(String[] args){

        Punkt p=new Punkt(10,15);
        Punkt p2 = new Punkt();
        
        System.out.println("wartosci to: "+p.x +" i "+p.y);
        System.out.println("wartosci to: "+p2.x +" i "+p2.y);
    }
}
class Punkt
{
    Punkt()
    {
        System.out.println("Wywołano konstruktor bez parametrow");
    }
    Punkt(int x, int y)
    {
        System.out.println("Wywołano konstrukor z parametrami");
        this.x=x;
        this.y= y;
    }
    int x;
    int y;
}