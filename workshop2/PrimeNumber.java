package workshop2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            intList.add(i);
        }

        System.out.println(primeNumber(intList));
    }

    private static List<Integer> primeNumber(List<Integer> intList) {
        List<Integer> primeList= new ArrayList<>();
            if (intList.contains(1) || intList.contains(2)) {
                primeList.add(2);
            }

            for (int i=2;  i < intList.size(); i++) {
                for(int j=1; j < i; j++){
                    if(intList.get(i) % j == 0){
                        primeList.add(intList.get(i));
                    }
            }
        }
        return primeList;
    }

}
