public class konstruktor{
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
    Punkt(int pierwszy, int drugi)
    {
        x=pierwszy;
        y= drugi;
    }
    int x;
    int y;
}