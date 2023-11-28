package kata2;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new TsvFileLoader(new File("persons.tsv")).load();
        Map<String, Integer> hist = new WeightHistogram(20, people).calculate();
    }
}