import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayLists {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Sofia");
        cities.add("Plovdiv");
        cities.add("Copenhagen");
        cities.add("Århus");
        cities.add("Düsseldorf");

        System.out.println("Before Sorting:");
        for (String str : cities) {
            System.out.println(str);
        }

        Collections.sort(cities);
        System.out.println();
        System.out.println("After Sorting:");
        for(String city:cities){
            System.out.println(city);
        }
    }
}