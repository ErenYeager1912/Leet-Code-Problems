class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length;i++) {
            int digits = 0;
            int n = num;
            while (n > 0) {
                digits++;
                n /= 10;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}    
