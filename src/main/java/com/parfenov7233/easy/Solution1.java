import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        rti("MMMCMIX");
    }

    public static int rti (String s) {
      /*  Map<String, Integer> romanMap = Map.ofEntries(
                Map.entry("M", 1000),
                Map.entry("CM", 900),
                Map.entry("D", 500),
                Map.entry("CD", 400),
                Map.entry("C", 100),
                Map.entry("XC", 90),
                Map.entry("L", 50),
                Map.entry("XL", 40),
                Map.entry("X", 10),
                Map.entry("IX", 9),
                Map.entry("V", 5),
                Map.entry("IV", 4),
                Map.entry("I", 1)
        );
        int rsl = 0;
        String[] array = s.split("");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
            if (i > 0 && romanMap.get(array[i]) > romanMap.get(array[i - 1])) {
                list.remove(array[i]);
                list.remove(array[i - 1]);
                list.add(array[i - 1] + array[i]);
            }
        }
        for (String element : list) {
            for (String mapElement : romanMap.keySet()) {
                if (element.equals(mapElement)) {
                    rsl = rsl + romanMap.get(mapElement);
                }
            }
        }
        for (String element : list) {
            System.out.println(element);
        }
        System.out.println(rsl);
        return rsl;
    } */
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }
        System.out.println(ans);
        return ans;
    }
}