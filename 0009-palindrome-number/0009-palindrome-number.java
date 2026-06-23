class Solution {
    public boolean isPalindrome(int x) {
        int dig;
        int rev =0;
        int num = x;
        while (x>0){
            dig = x%10;
            rev =(rev*10)+dig;
            x/=10;
        }
        if (num==rev){
            return true;
        }
        return false;
    }
}