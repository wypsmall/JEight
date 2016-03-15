package JEight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntBinaryOperator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

        players.forEach((player) -> System.out.println(player + "; "));
        System.out.println("======================================");
        players.forEach(System.out::println);
    }


}
