public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if ("aeiouAEIOU".indexOf(a[i]) < 0) {
                i++;
            }
            if ("aeiouAEIOU".indexOf(a[j]) < 0) {
                j--;
            }
            if ("aeiouAEIOU".indexOf(a[i]) >= 0 && "aeiouAEIOU".indexOf(a[j]) >= 0) {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }

            s = new String(a);
            return s;
        }
    }
}
