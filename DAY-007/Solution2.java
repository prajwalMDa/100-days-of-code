class Solution2 {
    public boolean isPalindrome(int x) {
        int num = x;
        int reverse = 0;
        while(x>0){
            reverse = x%10 + reverse*10;
            x/=10;
        }
        if(num == reverse){
            return true;
        }
        return false;
    }
}