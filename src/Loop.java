public class Loop {

    public static void main(String[] args) throws Exception
    {
        //foreach loop
        String[] names={"Alvine Llavu","Gracious Aganda","Heidi Mmbone"};

        for (String name:names)
        {
            System.out.println(name);
        }

        System.out.println(checkAge(21));
        System.out.println(castingValues(2,8));
        System.out.println(castDoubleToInt(20.0,20.0));
    }


    public static String  checkAge(int age)
    {
        if(age < 18)
        {
           return "Access Denied, Below Age";
        }
        else {
            return "Your Age is " + age;
        }
    }

    //casting values
    public static double castingValues(int a, int b)
    {
        int sum=a+b;
        return (double) sum;
    }

    public static int castDoubleToInt(double num1,double num2)
    {
        double multiplication=num1*num2;
        return (int) multiplication;
    }
}
