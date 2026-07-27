class Solution {
    public int countEven(int num) {
        int temp = num;
        int digitSum = 0;
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }
        return (digitSum % 2 == 0) ? num / 2 : (num - 1) / 2;
    }
}
