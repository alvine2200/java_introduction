public class Recursion {

    public static void main(String[] args) {
        int result=sum(10);
        System.out.println(result);

        int sumOfIntervals=sumIntervals(10,20);
        System.out.println(sumOfIntervals);
    }

    public static int sum(int k)
    {
        if (k > 0)
        {
            return k + sum(k-1);
        }else {
            return 0;
        }
    }

    public static int sumIntervals(int start,int end)
    {
         if(end > start)
         {
             return end + sumIntervals(start, end-1);
         }else{
             return 0;
         }
    }


}
