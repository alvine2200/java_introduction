import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bfn=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The First value");
        String str= bfn.readLine();

        System.out.println("Enter The second value");
        int num=Integer.parseInt(bfn.readLine());

        System.out.printf("The values inputted are \n %s \n %d",str,num);
        System.out.println();
    }
}
