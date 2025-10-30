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
