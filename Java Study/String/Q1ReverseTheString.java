package String;

public class Q1ReverseTheString {
    public static void main(String[] args) {
        String s = "DeepakKumarSingh";

        // 1st way to reverse the String
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        // 2nd way is
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb);

        
        // 3rd way to reverse
        char arr[] = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (char c : arr) {
            System.out.print(c);
        }
    }
}
