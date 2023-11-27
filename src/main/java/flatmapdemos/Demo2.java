package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> TeamA= Arrays.asList("Scott", "Kholi");
        List<String> TeamB= Arrays.asList("Dhoni","Pant");
        List<String> TeamC= Arrays.asList("Rana","Rishab");

        List<List<String>>PlayerInWorldCup= new ArrayList<List<String>>();
        PlayerInWorldCup.add(TeamA);
        PlayerInWorldCup.add(TeamB);
        PlayerInWorldCup.add(TeamC);

        List<String> names=PlayerInWorldCup.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
        System.out.println(names);

    }
    }

