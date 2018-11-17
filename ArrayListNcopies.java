import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNcopies {

    public static void main(String[] args) {

        ArrayList<Integer> obj = new ArrayList<Integer>(Collections.nCopies(10,7));

        System.out.println("My ArrayList of Integers:");
        System.out.println(obj);
    }
}
