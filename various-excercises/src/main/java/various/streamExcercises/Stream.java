package various.streamExcercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    List<Vegetables> vegetables = new ArrayList<>();

    public void adding() {

    Vegetables vegetable = new Vegetables("tomato", "mniam", List.of("asx", "sdfccd"));
    Vegetables vegetable2 = new Vegetables("onion" , "mniammniam", List.of("assdasadc", "sdfcasccasccd"));
    Vegetables vegetable3 = new Vegetables("cucumber", "ok", List.of("assssx", "sdssssfccd"));
    Vegetables vegetable4 = new Vegetables("pepper", "good", List.of("sx", "cd"));

    vegetables.add(vegetable);
    vegetables.add(vegetable2);
    vegetables.add(vegetable3);
    vegetables.add(vegetable4);
    }

    public void stream1() {
        List<List<String>> listOfList = vegetables.stream()
                .map(Vegetables::getWhatever)
                .collect(Collectors.toList());

        System.out.println(listOfList);

        List<String> vege2 = vegetables.stream()
                .map(Vegetables::getWhatever)
                .flatMap(list -> list.stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(vege2);

        vegetables.stream()
                .limit(2)
                .forEach(System.out::println);

    }

    public static void main(String[] args) {

        Stream stream = new Stream();
        stream.adding();
        stream.stream1();

    }
}
