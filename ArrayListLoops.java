import java.util.*;

public class ArrayListLoops {
    public static void main(String[] args) {


        ArrayList<String> obj = new ArrayList<String>(
                Arrays.asList("Dog", "Dolphin","Horse","Eagle"));


        System.out.println("For-Loop Iteration:");
        for (int i = 0; i < obj.size(); i++) {

            System.out.println(obj.get(i));

        }
        System.out.println();
        System.out.println("Using Advanced Loop:");
        for(String str:obj){
            System.out.println(str);
        }

        System.out.println();
        System.out.println("Using a While-Loop");

        int count =0;

        while(obj.size()>count){
            System.out.println(obj.get(count));
            count++;
        }

        System.out.println();
        System.out.println("Looping an ArrayLst Using an Iterator;");

        Iterator itr = obj.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
