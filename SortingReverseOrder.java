import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class SortingReverseOrder {

    public static void main(String[] args) {


        ArrayList <Integer> numbers = new ArrayList<Integer>(

                Arrays.asList(3,2,4,1,9,8,7,6,5));

        System.out.println("The initial list:");
        for(Integer num:numbers){
            System.out.print(num + " ");
        }

        Collections.sort(numbers);
        System.out.println();
        System.out.println("The sorted (in ascending order) list:");

        int count = 0;
        while(numbers.size() > count){
            System.out.print(numbers.get(count) + " ");
            count++;

        }


        Collections.sort(numbers,Collections.reverseOrder());           //or  Collections.reverse(numbers);
        System.out.println();
        System.out.println("The sorted (in descending order) list:");

        Iterator itr = numbers.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");


        }
    }
}
