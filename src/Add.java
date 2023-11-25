class Calcute
{
    public int add(int a,int b)
    {
        int result=a+b;
        return result;
    }
}

public class Add {
    public  static void main(String[] args){
        int a=5;
        int b=5;

//        initialize a class in a class
        Calcute calc=new Calcute();
        int c=calc.add(a,b);
        System.out.println(c);
    }
}

