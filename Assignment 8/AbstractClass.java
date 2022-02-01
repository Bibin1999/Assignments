package JavaProgram1;

abstract class One
{
    abstract void firstMethod();
     
    void secondMethod()
    {
        System.out.println("SECOND");
         
        firstMethod();
    }
}
 
abstract class Two extends One
{
    
    void firstMethod()
    {
        System.out.println("FIRST");
         
        thirdMethod();
    }
     
    abstract void thirdMethod();
}
 
class Three extends Two
{
    
    void thirdMethod()
    {
        System.out.println("THIRD");
    }
}
 
public class AbstractClass {

    public static void main(String[] args)
    {
        Three c = new Three();
         
        c.firstMethod();
         
        c.secondMethod();
         
        c.thirdMethod();
    }
}

