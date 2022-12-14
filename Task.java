import java.util.*;

public class Task {
    public static void main(String[] args) {
        forAdd abrakadabra = new forAdd();
        ArrayList<Integer> array = new ArrayList<>();
        array = abrakadabra.ReverseSort(10, 0, 100);
        array.forEach(i -> System.out.println(i + " "));

    }
}