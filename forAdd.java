import java.util.*;

public class forAdd {
    public ArrayList<Integer> ReverseSort(int n, int min, int max) {
        Set<Integer> set = new TreeSet<>();
        Random rnd = new Random();
        int number = 0;
        for (int i = 0; i < n; i++) {
            while (set.contains(number)) number = rnd.nextInt(min,max);
            set.add(number);
        }
        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
    }


