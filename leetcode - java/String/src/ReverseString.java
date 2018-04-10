public class ReverseString {
    public String reverseString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) result.append(s.charAt(i));
        return result.toString();
    }
    public String reverseString2(String s){
        char[] a=s.toCharArray();
        int n=s.length();
        for(int i=0;i<(n/2);i++){
            char temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        s=new String(a);
        return s;
    }
}
