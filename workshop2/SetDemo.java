package workshop2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo{

    public static void main(String[] args) {
        Set<String> setList = new HashSet<>();

        setList.add("pune");
        setList.add("Bangalore");
        setList.add("pune");


        System.out.println(setList);

    }
}
