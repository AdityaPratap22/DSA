class Solution {
    public boolean isPalindrome(int x) {
        
        int m, rev = 0, n;
        System.out.print("Enter the number:");
        m = x;
        while(x > 0)
        {
            n = x % 10;
            rev = rev * 10 + n;
            x = x / 10;
        }
        if(rev == m)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}