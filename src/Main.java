import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string");
        String input = scanner.nextLine();
        String output = reverse(input);
        System.out.println("New string is " + output);
        scanner.close();
    }

    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        char[] strArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) if (!Character.isLetter(strArray[start])) {
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

        return new String(strArray);
    }
}