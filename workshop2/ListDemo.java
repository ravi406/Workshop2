package workshop2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDemo {
    public static void main (String[] args) {

        List < String > strList = new ArrayList <> ();

        strList.add ("Monday");
        strList.add ("tuesday");
        strList.add ("Wednesday");
        strList.add ("Thursday");
        strList.add ("Friday");
        strList.add ("Saturday");
        strList.add ("sunday");

        searchElement (strList);

    }

    private static void searchElement (List < String > intList) {
        List < String > searchedList = new ArrayList <> ();
        Scanner sc = new Scanner (System.in);

        System.out.println ("Enter a charecter to serch in a List");
        char ch = sc.next ().charAt (0);
        String character = "" + ch;

        for (int i = 0; i < intList.size (); i++) {
            String element = intList.get (i).toLowerCase ();
            if (element.contains(character)) {
                searchedList.add(element);
            }
        }

        if (searchedList.isEmpty()){
            System.out.println("Charecter is not Found In a Given List");
        }else {
            System.out.println (searchedList);
        }
    }

}
