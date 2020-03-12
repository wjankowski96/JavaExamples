public class Punkcik{
    public static void main(final String[] args) {
        Object [] punkty = new Punkt[4];
        
        punkty[0] = new Punkt(20, 15);
        punkty[1] = new Punkt(10, 15);
        punkty[2] = new Punkt(30, 15);
        punkty[3] = new Punkt(20, 150);

       for (int i =0; i<punkty.length; i++)
       {
           System.out.println(punkty[i]);
       }
    }
}
class Punkt {
    private int x;
    private int y;
    Punkt()
    {

    }
    Punkt(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    int getx()
    {
        return x;
    }
    int gety()
    {
        return y;
    }
    public boolean equals (Object obj)
    {
        if (this==obj)
            return true;
        if (obj == null)
            return false;
        if (this. getClass() !=obj.getClass())
            return false;

        Punkt przyslany = (Punkt)obj;
        
        return this.x == przyslany.x && this.y == przyslany.y;
    }
    public String toString()
    {
        return getx() + " " + gety();
    }
}

