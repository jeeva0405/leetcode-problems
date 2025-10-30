1)  Minimum Number of Increments on Subarrays to Form a Target Array (Hard)

class Solution {
    public int minNumberOperations(int[] target) {
        int ans = target[0];
        for (int i = 1; i < target.length; i++) {
            if (target[i] > target[i - 1]) {
                ans += target[i] - target[i - 1];
            }
        }
        return ans;
    }
}

2) Smallest Number With All Set Bits

class Solution {
    public int smallestNumber(int n) {
        int x = n;
        while ((x & (x + 1)) != 0){
            x++;
        }
        
        return x;
        
    }
}

3)Add Two Integers

class Solution {
    public int sum(int num1, int num2) {
        return num1+num2;
        
    }
}

4) Add Digits

class Solution {
    public int addDigits(int num) {
        if(num%9==0 && num>0){
            return 9;
        }
        return num%9;
        
    }
}

5)Reverse String
    
    class Solution {
    public void reverseString(char[] s) {
        int  left=0,right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        
    }
}
6) Nim Game
    
class Solution {
    public boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }
        return true;
        
    }
}

