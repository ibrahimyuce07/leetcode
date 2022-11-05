public class ValidParentheses {
    public boolean isValid(String s) {
        char[] chars = new char[s.length()];
        int i = 0;

        char[] charArray = s.toCharArray();
        for (int j = 0; j < charArray.length; j++) {
            char c = charArray[j];
            if (c == '(') {
                chars[i++] = ')';
            } else if (c == '{') {
                chars[i++] = '}';
            } else if (c == '[') {
                chars[i++] = ']';
            } else {
                if (i == 0 || chars[--i] != c) {
                    return false;
                }
            }
        }
        return i == 0;
    }
}
