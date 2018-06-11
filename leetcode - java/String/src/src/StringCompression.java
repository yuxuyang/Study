/**
 * Created by yuxuyang on 2018/5/10.
 */
public class StringCompression {
    public int solution (char[] chars){
        int indexAns = 0, index = 0;
        while (index < chars.length) {
            char currentChar = chars[index];
            int count = 0;
            while (index < chars.length && chars[index] == currentChar) {
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if (count != 1) {
                for (char c : Integer.toString(count).toCharArray())
                    chars[indexAns++] = C;
            }
        }
        return indexAns;
    }
    public static main void (String args()){

    }
}
