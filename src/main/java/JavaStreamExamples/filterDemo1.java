package JavaStreamExamples;



import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class filterDemo1 {
    public static void main(String[] args) {
        List <Integer>numberList= Arrays.asList(10,15,20,25,30);
        List <Integer>evenNumberList=new ArrayList<Integer>();

        evenNumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumberList);

    }

}
