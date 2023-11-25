import java.text.DecimalFormat;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello Alvine, Welcome to Java");

        //declare data int in java
        int x=2,y=3,sum=x+y;
        System.out.printf("The sum of %d & %d is: %d \n", x,y,sum);

        //declare String in java
        String name="Alvine";
        String text="Please open the server Mr";

        System.out.printf("%s %s \n", text,name);

        //double
        double num1=2.25;
        double num2=3.25;
        double num3=num1/num2;

        DecimalFormat df=new DecimalFormat("#.##");
        String roundedNumber=df.format(num3);

        System.out.println(num1 + " "+ "+" + " " + num2 + " " +"="+ roundedNumber );
    }
}