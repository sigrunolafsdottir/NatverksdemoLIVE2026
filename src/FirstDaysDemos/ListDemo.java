package FirstDaysDemos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {


    void main(){
        List<String> stringList= new ArrayList<>();
        stringList.add("hej");
        stringList.add("svejs");

        for(String s: stringList){
            IO.println(s);
        }
        IO.println();

        List<Integer> intList= new LinkedList<>();
        intList.add(4);
        intList.add(7);
        intList.add(8);

        for(Integer s: intList){
            IO.println(s);
        }
        IO.println();

        List<Integer> intList2= List.of(7,6,5,4,3);
       // intList2.add(1);
        intList2.forEach(System.out::println);
        IO.println();

        List<Integer> intList3= new ArrayList<>(List.of(2,2,2));
        intList3.add(1);
        intList3.forEach(e -> IO.println(e));

    }
}
