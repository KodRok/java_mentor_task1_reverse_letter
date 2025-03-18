package utils;

public final class StringUtil {

    private StringUtil() {
    }

    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        char[] strArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (!Character.isLetter(strArray[start])) {
                start++;
            } else if (!Character.isLetter(strArray[end])) {
                end--;
            } else {
                char temp = strArray[start];
                strArray[start] = strArray[end];
                strArray[end] = temp;
                start++;
                end--;
            }
        }

        return new String(strArray);
    }
}