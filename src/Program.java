import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = skaitmenys(258);
        list.forEach(System.out::println);
    }

    public static List<Integer> skaitmenys (int x) {
        List<Integer> list = new ArrayList<Integer>();
        while (x != 0) {
            list.add(x % 10);
            x = x / 10;
        }
        Collections.reverse(list);
        return list;
    }
}
