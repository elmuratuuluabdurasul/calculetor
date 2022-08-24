import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){

        Integer [] array = {1,2,3,4,5,6,7,8,9,10,-12};
        List<Integer> list = Stream.of(array).filter(x -> x%2 ==0).collect(Collectors.toList());
        Integer maxValue = list.stream().map(x -> x * x).max(Integer::compare).get();
        System.out.println(maxValue);
        
    }
}