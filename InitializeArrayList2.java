import java.util.*;

public class InitializeArrayList2 {

    public static void main(String[] args) {


        ArrayList<String> obj = new ArrayList<String>() {
            {

                add("Peter");
                add("Sonya");
                add("David");
                add("Susan");
            }};
        System.out.println(obj);
    }
}