public class Inheritance {
    public static void main(String[] args)
    {
        AdvCalc calc=new AdvCalc();
        int sub=calc.sub(10,6);
        int add=calc.add(2,4);
        int multi= calc.multiply(2,3);
        int div= calc.divide(18,9);
        System.out.printf("Calc add : %d, Calc sub %d, Adv Multiply : %d Adv Divide : %d",add,sub,multi,div);

    }
}
