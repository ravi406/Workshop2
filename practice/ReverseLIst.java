package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseLIst {

    public static void main(String[] args) {
        List<String> newList = new ArrayList<>(Arrays.asList("Blue", "Red", "Green"));

        System.out.println(newList);
        System.out.println(newList.size());

        List<String> reversedList = new ArrayList<>();

        for (int i =newList.size()-1; i >= 0; i--){
                reversedList.add(newList.get(i));
        }

        System.out.println(reversedList);
    }
}
