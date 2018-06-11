public class ImplementStrStr {
    public int strStr(String haystack, String needle){
        for (int i = 0; ;i++){
            for (int j = 0; ;j++){
                if(j == needle.length()){
                    return i;
                }
                if(i+j == haystack.length()) {
                    return -1;
                }
                if( needle.charAt(j) != haystack.charAt(i+j)) break;
            }
        }
    }
    public int Solution2 (String haystack, String needle){
        if (needle.isEmpty()) return 0;
        for (int i =0; i<= haystack.length(); i++){
            for(int j= 0; j< needle.length() && haystack.charAt(i+j) == needle.charAt(j); j++){
                if(j == needle.length()-1) return i;
            }
        }
        return -1;
    }
}
