package ProgramDomyslneMetody;
public class metodydomyslne{    
        public static void main(String[] args) 
        {
            Formula f = (int a) -> {
                return 5;
            };
        }
    }

    interface Formula
    {
        double calculate(int a);
        default double sqrt(int a)
        {
            return Math.sqrt(a);
        }
    }
    
    class A implements Formula{
        public double calculate(int a)
        {
            return this.sqrt(a * 5);
        }
    }