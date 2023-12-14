import java.util.Scanner;

public class Scanning {

    static double sum(int a, int b)
    {
        return (double) a+b;
    }

    static void addition()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Number");

        int num1= Integer.parseInt(scan.nextLine());

        System.out.println("Enter Second Number");
        int num2= Integer.parseInt(scan.nextLine());

        double result=sum(num1,num2);
        System.out.printf("The result of Addition is : %.2f ",result);
    }

    public static void person()
    {
        Scanner myScan=new Scanner(System.in);
        System.out.println("Enter First Name");
        String fName=myScan.nextLine();

        System.out.println("Enter Second Name");
        String lName=myScan.nextLine();

        System.out.printf("Your Name is : %s %s ",fName,lName);
    }

    public static void main(String[] args) {
//       addition();
       person();
    }
}
