package practice;

import java.util.*;

public class ConvertArrayToList {

    public static void main(String[] args) {
        List<String> al=new ArrayList<>();
        String [] str = {"dog","pot","pepsi","rahul"};

        System.out.println("Before al"+al);
        Collections.addAll(al,str);
        System.out.println("after converting"+al);

//        for (int i=0; i < str.length; i++){
//            //System.out.println(str[i]);
//            al.add(str[i]);
//        }
//        for (String s :al){
//            System.out.println(s);
//        }

        String [] cities={"Bangalore","pune","mumbai","kolkata"};

        List<String> arrayList= new ArrayList<>(Arrays.asList(cities));

        Iterator newIt=arrayList.iterator();

        while(newIt.hasNext()){
            System.out.println(newIt.next());
        }

    }
}
