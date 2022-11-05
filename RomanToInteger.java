import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String input) {
        int result = 0;
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && romanMap.get(String.valueOf(chars[i])) < romanMap.get(String.valueOf(chars[i + 1]))) {
                result += romanMap.get(String.valueOf(chars[i + 1])) - romanMap.get(String.valueOf(chars[i]));
                i++;
            } else {
                result += romanMap.get(String.valueOf(chars[i]));
            }
        }
        return result;
    }
}
