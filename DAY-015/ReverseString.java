class ReverseString{
    public void reverseString(char[] s) {
        int n = s.length-1;
        int m = n;
        for(int i=0; i<=n/2; i++){
            char temp = s[m];
            s[m] = s[i];
            s[i] = temp;
            m--;
        }
    }
}