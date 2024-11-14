import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamExample {
    public static void main(String[] args) {
        
    }

    public void listFiltering(){
        // use Stream
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
        List<String> result = names.stream()
            .filter(name -> name.startsWith("J"))
            .collect(Collectors.toList());
        System.out.println(result); // [John, Jane, Jack]

        // not use Stream
        List<String> names0 = Arrays.asList("John", "Jane", "Jack", "Doe");
        List<String> result0 = new ArrayList<>();
        for (String name : names0) {
            if (name.startsWith("J")) {
                result0.add(name);
            }
        }
        System.out.println(result0); // [John, Jane, Jack]

    }

    public void listMapping(){
        //use Stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> squared = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println(squared); // [1, 4, 9, 16]
        
        //not use Stream
        List<Integer> numbers0 = Arrays.asList(1, 2, 3, 4);
        List<Integer> squared0 = new ArrayList<>();
        for (Integer n : numbers0) {
            squared0.add(n * n);
        }
        System.out.println(squared0); // [1, 4, 9, 16]

    }
}
