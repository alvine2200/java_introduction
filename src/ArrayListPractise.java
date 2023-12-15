import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPractise {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add(0,"Volvo");
        cars.add(1,"Prado");
        cars.add(2,"Subaru");
        cars.add(3,"Mazda");

        System.out.println(cars);

        //show using foreach
        for(String car : cars)
        {
            System.out.println(car);
        }

        System.out.println("\n");

        //sorting an array list
        Collections.sort(cars);

        //show using for
        for(int car=0; car<cars.size(); car++)
        {
            System.out.println(cars.get(car));
        }

        System.out.println("\n");
        System.out.println("Array Integer List Begins");

        arrayIntegerList();
    }


    static void arrayIntegerList()
    {
        ArrayList<Integer> myNumbers=new ArrayList<Integer>();
        myNumbers.add(0,1);
        myNumbers.add(1,20);
        myNumbers.add(2,5);
        myNumbers.add(3,36);
        myNumbers.add(4,60);
        myNumbers.add(5,8);

        //print all numbers using foreach before sorting
        for(Integer num : myNumbers)
        {
            System.out.println(num);
        }

        //sort integers
        Collections.sort(myNumbers);
        for (int number=0; number<myNumbers.size(); number++)
        {
            System.out.println(myNumbers.get(number));
        }
    }

}
