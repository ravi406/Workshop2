package workshop2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>(Arrays.asList('a','0','b','c','d','0','0','e','f','g','0','h'));
        System.out.println(list);

        deleteZero(list);
    }

    private static void deleteZero(List<Character> list) {
       Character ch='0';
       for (int i=0; i <list.size(); i++){
           list.remove(ch);
       }
    }
}
